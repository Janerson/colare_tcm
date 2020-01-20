package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um.LicitacaoFaseUm;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.LicitacaoFaseUmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${lic.licitacao-fase-um}")
public class LicitacaoFaseUmController extends BaseController<LicitacaoFaseUm,Long, LicitacaoFaseUmRepository> {

    @Autowired
    public LicitacaoFaseUmController(LicitacaoFaseUmRepository repository) {
        super(repository);
    }
}
