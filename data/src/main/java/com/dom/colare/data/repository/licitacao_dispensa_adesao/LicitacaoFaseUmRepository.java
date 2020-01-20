package com.dom.colare.data.repository.licitacao_dispensa_adesao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um.LicitacaoFaseUm;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicitacaoFaseUmRepository extends PagingAndSortingRepository<LicitacaoFaseUm,Long> {
}
