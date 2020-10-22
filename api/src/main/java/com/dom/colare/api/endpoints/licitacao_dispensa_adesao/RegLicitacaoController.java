package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.lic.reg_licitacao.RegLicitacaoDTO;
import com.dom.colare.domain.services.lic.RegLicitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${lic.regulamentacao}")
public class RegLicitacaoController extends BaseController<RegLicitacaoDTO, UUID> {

    @Autowired
    public RegLicitacaoController(RegLicitacaoService service) {
        super(service);
    }


}
