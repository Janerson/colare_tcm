package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico.PessoalEditalDeConcursoProcessoSeletivoPublico;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalEditalConcurProcessSelPublicoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-concurso-psp}")
public class PessoalEditalConcursoPSPController extends BaseController<PessoalEditalDeConcursoProcessoSeletivoPublico,
        Long, PessoalEditalConcurProcessSelPublicoRepository> {
    public PessoalEditalConcursoPSPController(PessoalEditalConcurProcessSelPublicoRepository repository) {
        super(repository);
    }
}
