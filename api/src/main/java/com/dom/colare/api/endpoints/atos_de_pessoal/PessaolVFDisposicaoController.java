package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_disposicao.PessoalVidaFuncionalDisposicao;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalVidaFunDisposicaoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-vf-disposicao}")
public class PessaolVFDisposicaoController extends BaseController<PessoalVidaFuncionalDisposicao,Long, PessoalVidaFunDisposicaoRepository> {
    public PessaolVFDisposicaoController(PessoalVidaFunDisposicaoRepository repository) {
        super(repository);
    }
}
