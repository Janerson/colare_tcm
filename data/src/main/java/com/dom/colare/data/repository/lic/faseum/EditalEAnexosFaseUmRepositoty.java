package com.dom.colare.data.repository.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.EditalEAnexoFase1;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EditalEAnexosFaseUmRepositoty extends BaseRespository<EditalEAnexoFase1, UUID> {

    @Query("SELECT E FROM LICITACAOFASE1 L INNER JOIN L.editalEAnexos E where L.uuid = :uuid " +
            "and E.descricao like %:search% or E.descricao is null")
    Page<EditalEAnexoFase1> findBy(Pageable pageable, @Param("uuid") UUID uuid, @Param("search") String search);

}
