package com.dom.colare.domain.services.lic;

import com.dom.colare.core.entidades.lic.contrato_ini.ContratoInicial;
import com.dom.colare.data.repository.lic.ContratoInicialRepository;
import com.dom.colare.domain.dto.lic.contrato_ini.ContratoInicialDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContratoInicialService extends BaseService<ContratoInicialDTO, UUID, ContratoInicial> {

    public ContratoInicialService(ContratoInicialRepository repository) {
        super(repository, ContratoInicialDTO.class, ContratoInicial.class);
    }
}
