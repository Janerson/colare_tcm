package com.dom.colare.data.repository.folha_de_pagamento;

import com.dom.colare.core.entidades.folha_pagamento.pes_fp_exc_orcm.PessoalExecucaoOrcamentariaFolhaPagamento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalExecucaoOrcamentariaRepository extends PagingAndSortingRepository<PessoalExecucaoOrcamentariaFolhaPagamento,Long> {
}
