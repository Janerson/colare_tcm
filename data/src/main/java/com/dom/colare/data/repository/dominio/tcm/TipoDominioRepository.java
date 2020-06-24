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

@Repository
public interface TipoDominioRepository extends BaseRespository<TipoDominio,Long> {

    TipoDominio findByNomeTipoDominioEquals(String nome);

    /**
     * @Query(value = "SELECT d.id, d.ativo, d.codigo, d.descricao, d.vigencia FROM dominio d " +
     * " INNER JOIN tipo_dominio ON tipo_dominio.id = d.tp_dominio_id\n" +
     * " WHERE tipo_dominio.nome_tipo_dominio= :nome",nativeQuery = true)
     */

    @Query(value = "select d from dominio d, tipo_dominio t where d member of t.dominios and t.nomeTipoDominio = :nome")
    Page<Dominio> findByNomeTipoDominioEquals(Pageable p, @Param("nome") String nome);

    @Query(value = "select d from dominio d, tipo_dominio t where d member of t.dominios and t.nomeTipoDominio = :nome and d.ativo = :status")
    List<Dominio> listar(@Param("nome") String nome, @Param("status") boolean status);
}
