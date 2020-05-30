package com.dom.colare.data.repository.folha_de_pagamento;

import com.dom.colare.core.entidades.folha_pagamento.pes_folhapag.PessoalFolhaDePagamento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalFolhaDePagamentoRepository extends PagingAndSortingRepository<PessoalFolhaDePagamento,Long> {
}
