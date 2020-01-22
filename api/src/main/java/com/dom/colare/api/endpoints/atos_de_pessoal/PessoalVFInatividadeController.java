package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_desligamento_inatividade.PessoalVidaFuncionalDesligamentoInatividade;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalVidaFunDeslInativRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-vf-desl-inatividade}")
public class PessoalVFInatividadeController extends BaseController<PessoalVidaFuncionalDesligamentoInatividade,Long, PessoalVidaFunDeslInativRepository> {
    public PessoalVFInatividadeController(PessoalVidaFunDeslInativRepository repository) {
        super(repository);
    }
}
