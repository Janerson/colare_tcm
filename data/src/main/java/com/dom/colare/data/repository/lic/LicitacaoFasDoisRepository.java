package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.licitacao_fase2.LicitacaoFaseDois;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicitacaoFasDoisRepository extends PagingAndSortingRepository<LicitacaoFaseDois,Long> {
}
