package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.lic.contrato_adt.ContratoAditivo;
import com.dom.colare.domain.services.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

//https://virtual.tcm.go.gov.br/recepcao/LIC/CONTRATO_RESC/01/2020

@RestController
@RequestMapping("${lic.contrato-aditivo}")
public class ContratoAditivoController extends BaseController<ContratoAditivo, UUID> {

    public ContratoAditivoController(BaseService<UUID, ContratoAditivo> service) {
        super(service);
    }
}
