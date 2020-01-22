package com.dom.colare.data.repository.folha_de_pagamento;

import com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria.PessoalExecucaoOrcamentariaFolhaPagamento;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoalExecucaoOrcamentariaRepository extends PagingAndSortingRepository<PessoalExecucaoOrcamentariaFolhaPagamento,Long> {
}
