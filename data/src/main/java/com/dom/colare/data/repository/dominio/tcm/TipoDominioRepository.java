package com.dom.colare.data.repository.dominio.tcm;

import com.dom.colare.core.entidades.dominio.Dominio;
import com.dom.colare.core.entidades.dominio.TipoDominio;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TipoDominioRepository extends BaseRespository<TipoDominio, UUID> {

    TipoDominio findByNomeTipoDominioEquals(String nome);

    //
    @Query(value = "select d from dominio d, tipo_dominio t " +
            "where d member of t.dominios " +
            "and t.nomeTipoDominio = :nome and d.descricao like :descricao")
    Page<Dominio> findByNomeTipoDominioEquals(Pageable p, @Param("nome") String nome, @Param("descricao") String descricao);

    @Query(value = "select d from dominio d, tipo_dominio t " +
            "where d member of t.dominios and t.nomeTipoDominio = :nome" +
            " and d.ativo = :status order by d.codigo")
    List<Dominio> listar(@Param("nome") String nome, @Param("status") boolean status);
}
