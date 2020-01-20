package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.situacao_procedimento.SituacaoProcedimento;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.SituacaoProcedimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://virtual.tcm.go.gov.br/recepcao/LIC/SITUACAO_PROCED/01/2020
@RestController
@RequestMapping("${lic.situacao}")
public class SituacaoProcedimentoController extends BaseController<SituacaoProcedimento,Long, SituacaoProcedimentoRepository> {


    @Autowired
    public SituacaoProcedimentoController(SituacaoProcedimentoRepository repository) {
        super(repository);
    }
}
