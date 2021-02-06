package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.lic.contrato_ini.ContratoInicial;
import com.dom.colare.domain.services.lic.contrato.ContratoInicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("${lic.contrato-inicial}")
public class ContratoInicialController  extends BaseController<ContratoInicial, UUID> {


    @Autowired
    public ContratoInicialController(ContratoInicialService service) {
        super(service);
    }
}
