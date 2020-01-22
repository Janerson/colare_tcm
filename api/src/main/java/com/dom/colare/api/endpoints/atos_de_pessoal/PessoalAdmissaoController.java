package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao.PessoalAdmissao;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalAdmissaoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-admissao}")
public class PessoalAdmissaoController extends BaseController<PessoalAdmissao,Long, PessoalAdmissaoRepository> {
    public PessoalAdmissaoController(PessoalAdmissaoRepository repository) {
        super(repository);
    }
}
