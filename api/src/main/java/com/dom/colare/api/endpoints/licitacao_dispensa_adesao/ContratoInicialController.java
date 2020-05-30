package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.lic.contrato_ini.ContratoInicialDTO;
import com.dom.colare.domain.services.lic.ContratoInicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${lic.contrato-inicial}")
public class ContratoInicialController  extends BaseController<ContratoInicialDTO,Long, ContratoInicialService> {


    @Autowired
    public ContratoInicialController(ContratoInicialService service) {
        super(service);
    }
}
