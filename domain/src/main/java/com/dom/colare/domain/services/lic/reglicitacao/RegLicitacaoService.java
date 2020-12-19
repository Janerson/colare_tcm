package com.dom.colare.domain.services.lic.reglicitacao;


import com.dom.colare.core.entidades.lic.reg_licitacao.RegLicitacao;
import com.dom.colare.data.repository.lic.reglicitacao.RegLicitacaoRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegLicitacaoService  extends BaseService<UUID,RegLicitacao> {

    public RegLicitacaoService(RegLicitacaoRepository repository) {
        super(repository);
    }
}
