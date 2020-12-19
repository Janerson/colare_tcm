package com.dom.colare.data.repository.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.PublicacaoFaseUm;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublicacaoFaseUmRepositoty extends BaseRespository<PublicacaoFaseUm, UUID> {

    @Query("SELECT P FROM LICITACAOFASE1 L INNER JOIN L.publicacao P where L.uuid = :uuid " +
            "and P.descricao like %:search% or P.descricao is null")
    Page<PublicacaoFaseUm> findBy(Pageable pageable, @Param("uuid") UUID uuid, @Param("search") String search);

}
