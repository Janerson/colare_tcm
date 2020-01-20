package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois.LicitacaoFaseDois;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.LicitacaoFasDoisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${lic.licitacao-fase-dois}")
public class LicitacaoFaseDoisController extends BaseController<LicitacaoFaseDois,Long, LicitacaoFasDoisRepository> {

    @Autowired
    public LicitacaoFaseDoisController(LicitacaoFasDoisRepository repository) {
        super(repository);
    }
}
