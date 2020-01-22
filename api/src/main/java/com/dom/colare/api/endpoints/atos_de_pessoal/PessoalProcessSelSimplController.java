package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado.PessoalEditalProcessoSeletivoSimplificado;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalProcessSelSimplRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-proc-sel-simplificado}")
public class PessoalProcessSelSimplController extends BaseController<PessoalEditalProcessoSeletivoSimplificado, Long, PessoalProcessSelSimplRepository> {
    public PessoalProcessSelSimplController(PessoalProcessSelSimplRepository repository) {
        super(repository);
    }
}
