package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco.AdesaoARegistroDePrecos;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.AdesaoARegistroDePrecosRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${lic.adesao-registro-precos}")
public class AdesaoARegistroDePrecosController extends BaseController<AdesaoARegistroDePrecos,Long, AdesaoARegistroDePrecosRepository> {

    public AdesaoARegistroDePrecosController(AdesaoARegistroDePrecosRepository repository) {
        super(repository);
    }
}
