package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.lic.reg_licitacao.RegLicitacao;
import com.dom.colare.domain.services.lic.reglicitacao.RegLicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${lic.regulamentacao}")
public class RegLicitacaoController extends BaseController<RegLicitacao, UUID> {

    @Autowired
    public RegLicitacaoController(RegLicitacaoService service) {
        super(service);
    }


}
