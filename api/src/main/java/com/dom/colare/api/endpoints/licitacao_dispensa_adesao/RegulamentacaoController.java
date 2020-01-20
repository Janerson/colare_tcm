package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.regulamentacao_procedimentos_licitatorio.Regulamentacao;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.RegulamentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://virtual.tcm.go.gov.br/recepcao/LIC/REG_LICITACAO/01/2020
@RestController
@RequestMapping("${lic.regulamentacao}")
public class RegulamentacaoController extends BaseController<Regulamentacao, Long, RegulamentacaoRepository> {

    @Autowired
    public RegulamentacaoController(RegulamentacaoRepository repository) {
        super(repository);
    }


}
