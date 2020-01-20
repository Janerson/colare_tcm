package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial.ContratoInicial;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.ContratoInicialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${lic.contrato-inicial}")
public class ContratoInicialController extends BaseController<ContratoInicial,Long, ContratoInicialRepository> {

    @Autowired
    public ContratoInicialController(ContratoInicialRepository repository) {
        super(repository);
    }
}
