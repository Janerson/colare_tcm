package com.dom.colare.data.repository.licitacao_dispensa_adesao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois.LicitacaoFaseDois;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicitacaoFasDoisRepository extends PagingAndSortingRepository<LicitacaoFaseDois,Long> {
}
