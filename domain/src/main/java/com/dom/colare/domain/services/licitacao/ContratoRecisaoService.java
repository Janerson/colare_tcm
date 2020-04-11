package com.dom.colare.domain.services.licitacao;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao.ContratoRecisao;
import com.dom.colare.data.repository.licitacao_dispensa_adesao.ContratoRecisaoRepository;
import com.dom.colare.domain.dto.licitacao.contrato.recisao.ContratoRecisaoDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ContratoRecisaoService extends BaseService<ContratoRecisaoDTO,Long, ContratoRecisao> {

    public ContratoRecisaoService(ContratoRecisaoRepository repository) {
        super(repository, ContratoRecisaoDTO.class, ContratoRecisao.class);
    }
}
