package com.dom.colare.data.repository.lic;

import com.dom.colare.core.entidades.lic.licitacao_fase1.LicitacaoFaseUm;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicitacaoFaseUmRepository extends PagingAndSortingRepository<LicitacaoFaseUm,Long> {
}
