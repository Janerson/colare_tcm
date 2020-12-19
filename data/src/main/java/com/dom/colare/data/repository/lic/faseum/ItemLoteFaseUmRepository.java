package com.dom.colare.data.repository.lic.faseum;

import com.dom.colare.core.entidades.lic.licitacao_fase1.ItemFaseUm;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemLoteFaseUmRepository extends BaseRespository<ItemFaseUm, UUID> {

    @Query("select item from LOTE_FASE1 l inner join  l.item item where l.uuid=:uuid and item.descricao like  %:search% order by item.seq")
    Page<ItemFaseUm> findBy(Pageable pageable, @Param("uuid") UUID uuid, @Param("search") String search);
}
