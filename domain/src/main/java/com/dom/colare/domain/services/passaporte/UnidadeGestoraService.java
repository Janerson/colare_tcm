package com.dom.colare.domain.services.passaporte;

import com.dom.colare.core.entidades.passaporte.UnidadeGestora;
import com.dom.colare.data.repository.passaporte.UnidadeGestoraRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UnidadeGestoraService extends BaseService<UUID, UnidadeGestora> {

    private final UnidadeGestoraRepository repository;

    public UnidadeGestoraService(UnidadeGestoraRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
