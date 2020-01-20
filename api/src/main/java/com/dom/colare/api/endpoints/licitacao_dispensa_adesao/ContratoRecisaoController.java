package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao.ContratoRecisao;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.ContratoRecisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://virtual.tcm.go.gov.br/recepcao/LIC/CONTRATO_RESC/01/2020

@RestController
@RequestMapping("${lic.contrato-recisao}")
public class ContratoRecisaoController extends BaseController<ContratoRecisao,Long, ContratoRecisaoRepository> {

    @Autowired
    public ContratoRecisaoController(ContratoRecisaoRepository repository) {
        super(repository);
    }
}