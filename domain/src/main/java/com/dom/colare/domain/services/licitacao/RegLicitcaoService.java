package com.dom.colare.domain.services.licitacao;


import com.dom.colare.core.entidades.licitacao_dispensa_adesao.regulamentacao_procedimentos_licitatorio.RegLicitacao;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.RegLicitacaoRepository;
import com.dom.colare.domain.dto.licitacao.reg_licitacao.RegLicitacaoDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class RegLicitcaoService  extends BaseService<RegLicitacaoDTO,Long, RegLicitacao> {

    public RegLicitcaoService(RegLicitacaoRepository repository) {
        super(repository, RegLicitacaoDTO.class, RegLicitacao.class);
    }
}
