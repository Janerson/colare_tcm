package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LoteFaseUm;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoteFaseUmRepository extends BaseRespository<LoteFaseUm, UUID> {

    @Query("select l from LICITACAOFASE1 lic inner join lic.lote l where lic.uuid=:uuid and l.descricaoLote like %:search% order by l.seq")
    Page<LoteFaseUm> findBy(Pageable pageable, @Param("uuid") UUID uuid, @Param("search") String search);

}
