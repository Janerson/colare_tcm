package com.dom.colare.domain.services.lic;


import com.dom.colare.core.entidades.lic.reg_licitacao.RegLicitacao;
import com.dom.colare.data.repository.lic.RegLicitacaoRepository;
import com.dom.colare.domain.dto.lic.reg_licitacao.RegLicitacaoDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegLicitcaoService  extends BaseService<RegLicitacaoDTO, UUID,RegLicitacao> {

    public RegLicitcaoService(RegLicitacaoRepository repository) {
        super(repository, RegLicitacaoDTO.class, RegLicitacao.class);
    }
}
