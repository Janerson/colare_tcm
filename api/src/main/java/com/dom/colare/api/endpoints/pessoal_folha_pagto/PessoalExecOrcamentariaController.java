package com.dom.colare.api.endpoints.pessoal_folha_pagto;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria.PessoalExecucaoOrcamentariaFolhaPagamento;
import com.dom.colare.data.repository.folha_de_pagamento.PessoalExecucaoOrcamentariaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${folhapagamento.execucao-orcamentaria}")
public class PessoalExecOrcamentariaController extends BaseController<PessoalExecucaoOrcamentariaFolhaPagamento,Long, PessoalExecucaoOrcamentariaRepository> {
    public PessoalExecOrcamentariaController(PessoalExecucaoOrcamentariaRepository repository) {
        super(repository);
    }
}
