package com.dom.colare.api.endpoints.atos_de_pessoal;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto.PessoalConcessaoVantagemDesconto;
import com.dom.colare.data.repository.atos_de_pessoal.PessoalConcessaoVantegamDescontoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${atosdepessoal.pessoal-concessao}")
public class PessoalConcessaoController extends BaseController<PessoalConcessaoVantagemDesconto,Long, PessoalConcessaoVantegamDescontoRepository> {
    public PessoalConcessaoController(PessoalConcessaoVantegamDescontoRepository repository) {
        super(repository);
    }
}
