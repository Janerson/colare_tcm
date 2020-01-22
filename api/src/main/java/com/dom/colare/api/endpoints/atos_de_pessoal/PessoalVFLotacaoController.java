package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_lotacao.PessoalVidaFuncionalLotacao;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalVidaFunLotacaoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-vf-lotacao}")
public class PessoalVFLotacaoController extends BaseController<PessoalVidaFuncionalLotacao,Long, PessoalVidaFunLotacaoRepository> {
    public PessoalVFLotacaoController(PessoalVidaFunLotacaoRepository repository) {
        super(repository);
    }
}
