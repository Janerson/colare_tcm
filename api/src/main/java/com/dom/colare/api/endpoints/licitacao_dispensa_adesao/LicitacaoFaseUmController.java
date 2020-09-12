package com.dom.colare.api.endpoints.licitacao_dispensa_adesao;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.lic.licitacao_faseum.LicitacaoFaseUmDTO;
import com.dom.colare.domain.services.lic.LicitacaoFaseUmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
@RequestMapping("${lic.licitacao-fase-um}")
public class LicitacaoFaseUmController extends BaseController<LicitacaoFaseUmDTO, UUID> {

    private final LicitacaoFaseUmService service;

    @Autowired
    public LicitacaoFaseUmController(LicitacaoFaseUmService service) {
        super(service);
        this.service = service;
    }
}
