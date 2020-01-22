package com.dom.colare.api.endpoints.pessoal_folha_pagto;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento.PessoalFolhaDePagamento;
import com.dom.colare.data.repository.folha_de_pagamento.PessoalFolhaDePagamentoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${folhapagamento.folha-de-pagamento}")
public class PessoalFolhaPagamentoController extends BaseController<PessoalFolhaDePagamento,Long, PessoalFolhaDePagamentoRepository> {
    public PessoalFolhaPagamentoController(PessoalFolhaDePagamentoRepository repository) {
        super(repository);
    }
}
