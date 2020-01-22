package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cadastro.PessoalCadastro;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalCadastroRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-cadastro}")
public class PessoalCadastroController extends BaseController<PessoalCadastro,Long, PessoalCadastroRepository> {
    public PessoalCadastroController(PessoalCadastroRepository repository) {
        super(repository);
    }
}
