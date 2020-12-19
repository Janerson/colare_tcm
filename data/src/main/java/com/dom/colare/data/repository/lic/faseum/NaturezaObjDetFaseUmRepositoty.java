package com.dom.colare.data.repository.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.NaturezaObjetoDetalhadaFase1;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NaturezaObjDetFaseUmRepositoty extends BaseRespository<NaturezaObjetoDetalhadaFase1, UUID> {

   @Query("SELECT n FROM LICITACAOFASE1 L INNER JOIN L.naturezaDoObjetoDetalhada n on L.uuid = :uuid " +
           " inner join dominio d on d.codigo = n.codNaturezaObjetoDetalhada"+
           " inner join tipo_dominio t on t.nomeTipoDominio = 'Natureza do Objeto - Detalhada'"+
            " and d.descricao like %:search% or d.descricao is null")
    Page<NaturezaObjetoDetalhadaFase1> findBy(Pageable pageable, @Param("uuid") UUID uuid, @Param("search") String search);

}
