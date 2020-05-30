package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.reg_licitacao.RegLicitacao;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegLicitacaoRepository extends PagingAndSortingRepository<RegLicitacao, Long> {
}
