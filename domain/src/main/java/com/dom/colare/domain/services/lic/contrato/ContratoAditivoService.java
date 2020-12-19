package com.dom.colare.domain.services.lic.contrato;

import com.dom.colare.core.entidades.lic.contrato_adt.ContratoAditivo;
import com.dom.colare.data.repository.lic.ContratoAditivoRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContratoAditivoService extends BaseService<UUID, ContratoAditivo> {


    public ContratoAditivoService(ContratoAditivoRepository repository) {
        super(repository);
    }
}
