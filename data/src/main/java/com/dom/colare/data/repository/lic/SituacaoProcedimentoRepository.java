package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.situacao_proced.SituacaoProcedimento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituacaoProcedimentoRepository extends PagingAndSortingRepository<SituacaoProcedimento, Long> {
}
