package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.licitacao.reg_licitacao.RegLicitacaoDTO;
import com.dom.colare.domain.services.licitacao.RegLicitcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${lic.regulamentacao}")
public class RegulamentacaoController extends BaseController<RegLicitacaoDTO, Long, RegLicitcaoService> {

    @Autowired
    public RegulamentacaoController(RegLicitcaoService service) {
        super(service);
    }


}
