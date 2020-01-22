package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos.PessoalCargos;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalCargosRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-cargos}")
public class PessoalCargosController extends BaseController<PessoalCargos,Long, PessoalCargosRepository> {
    public PessoalCargosController(PessoalCargosRepository repository) {
        super(repository);
    }
}
