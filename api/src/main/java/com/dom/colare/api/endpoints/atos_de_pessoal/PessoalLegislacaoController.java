package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao.PessoalLegislacao;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalLegislacaoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-lesgilacao}")
public class PessoalLegislacaoController extends BaseController<PessoalLegislacao, Long, PessoalLegislacaoRepository> {
    public PessoalLegislacaoController(PessoalLegislacaoRepository repository) {
        super(repository);
    }
}
