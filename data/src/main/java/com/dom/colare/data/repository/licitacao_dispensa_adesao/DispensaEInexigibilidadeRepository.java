package com.dom.colare.data.repository.licitacao_dispensa_adesao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade.DispensaEInexigibilidade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispensaEInexigibilidadeRepository extends PagingAndSortingRepository<DispensaEInexigibilidade,Long> {
}