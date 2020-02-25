package com.dom.colare.data.repository.licitacao_dispensa_adesao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.regulamentacao_procedimentos_licitatorio.RegLicitacao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegLicitacaoRepository extends PagingAndSortingRepository<RegLicitacao, Long> {
}
