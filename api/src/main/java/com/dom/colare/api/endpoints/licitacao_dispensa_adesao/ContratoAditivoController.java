package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo.ContratoAditivo;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.ContratoAditivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://virtual.tcm.go.gov.br/recepcao/LIC/CONTRATO_RESC/01/2020

@RestController
@RequestMapping("${lic.contrato-aditivo}")
public class ContratoAditivoController extends BaseController<ContratoAditivo,Long, ContratoAditivoRepository> {

    @Autowired
    public ContratoAditivoController(ContratoAditivoRepository repository) {
        super(repository);
    }
}
