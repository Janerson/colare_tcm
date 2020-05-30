package com.dom.colare.domain.services.lic;

import com.dom.colare.core.entidades.lic.contrato_resc.ContratoRecisao;
import com.dom.colare.data.repository.lic.ContratoRecisaoRepository;
import com.dom.colare.domain.dto.lic.contrato_resc.ContratoRecisaoDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ContratoRecisaoService extends BaseService<ContratoRecisaoDTO,Long, ContratoRecisao> {

    public ContratoRecisaoService(ContratoRecisaoRepository repository) {
        super(repository, ContratoRecisaoDTO.class, ContratoRecisao.class);
    }
}
