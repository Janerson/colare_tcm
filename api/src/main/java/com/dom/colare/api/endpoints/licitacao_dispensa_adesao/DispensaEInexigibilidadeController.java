package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade.DispensaEInexigibilidade;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.DispensaEInexigibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("${lic.dispensa-inexigibilidade}")
public class DispensaEInexigibilidadeController extends BaseController<DispensaEInexigibilidade,Long, DispensaEInexigibilidadeRepository> {

    @Autowired
    public DispensaEInexigibilidadeController(DispensaEInexigibilidadeRepository repository) {
        super(repository);
    }
}
