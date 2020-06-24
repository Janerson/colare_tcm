package com.dom.colare.data.repository.folha_de_pagamento;

import com.dom.colare.core.entidades.folha_pagamento.pes_folhapag.PessoalFolhaDePagamento;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PessoalFolhaDePagamentoRepository extends BaseRespository<PessoalFolhaDePagamento, UUID> {
}
