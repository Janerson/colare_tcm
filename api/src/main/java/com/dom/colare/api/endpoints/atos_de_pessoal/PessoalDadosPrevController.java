package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios.PessoalDadosPrevidenciarios;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalDadosPrevidenciariosRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-dados-prev}")
public class PessoalDadosPrevController extends BaseController<PessoalDadosPrevidenciarios,Long, PessoalDadosPrevidenciariosRepository> {
    public PessoalDadosPrevController(PessoalDadosPrevidenciariosRepository repository) {
        super(repository);
    }
}
