package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.lic.contrato_resc.ContratoRecisaoDTO;
import com.dom.colare.domain.services.lic.ContratoRecisaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//https://virtual.tcm.go.gov.br/recepcao/LIC/CONTRATO_RESC/01/2020

@RestController
@RequestMapping("${lic.contrato-recisao}")
public class ContratoRecisaoController extends BaseController<ContratoRecisaoDTO, UUID> {

    @Autowired
    public ContratoRecisaoController(ContratoRecisaoService service) {
        super(service);
    }
}
