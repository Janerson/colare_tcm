package com.dom.colare.domain.services.lic.contrato;

import com.dom.colare.core.entidades.lic.contrato_resc.ContratoRecisao;
import com.dom.colare.data.repository.lic.ContratoRecisaoRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContratoRecisaoService extends BaseService<UUID,ContratoRecisao> {

    public ContratoRecisaoService(ContratoRecisaoRepository repository) {
        super(repository);
    }
}
