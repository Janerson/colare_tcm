package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_licenca.PessoalVidaFuncionalLicenca;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalVidaFunLicencaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-vf-licenca}")
public class PessoalVFLicencaController extends BaseController<PessoalVidaFuncionalLicenca,Long, PessoalVidaFunLicencaRepository> {
    public PessoalVFLicencaController(PessoalVidaFunLicencaRepository repository) {
        super(repository);
    }
}
