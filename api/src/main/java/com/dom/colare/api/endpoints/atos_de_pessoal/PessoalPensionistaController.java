package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista.PessoalPensionista;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalPensionistaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-pensionista}")
public class PessoalPensionistaController extends BaseController<PessoalPensionista,Long, PessoalPensionistaRepository> {
    public PessoalPensionistaController(PessoalPensionistaRepository repository) {
        super(repository);
    }
}
