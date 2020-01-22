package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal.homologacao.PessoalHomolagacao;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalHomologacaoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-homologacao}")
public class PessoalHomologacaoController extends BaseController<PessoalHomolagacao,Long, PessoalHomologacaoRepository> {
    public PessoalHomologacaoController(PessoalHomologacaoRepository repository) {
        super(repository);
    }
}
