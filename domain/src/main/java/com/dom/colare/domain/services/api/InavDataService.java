package com.dom.colare.domain.services.api;

import com.dom.colare.core.entidades.api.inav.INavData;
import com.dom.colare.data.repository.dominio.api.INavDataRepository;
import com.dom.colare.domain.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class InavDataService extends BaseService< UUID, INavData> {

    private INavDataRepository repository;

    @Autowired
    public InavDataService(INavDataRepository repository) {
        super(repository);
        this.repository = repository;
    }


    public List<INavData> listarPorStatus(boolean show) {
        return repository.listarTodos(show);
    }


    public Page<INavData> listar(Pageable pageable) {
        return repository.listar(pageable);

    }

    public Page<INavData> listarPorUrlIniciandoCom(Pageable pageable, String path, String name) {
        return repository.getAllByUrlContainingAndNameContaining(pageable, path, name);

    }
    public INavData listarPorLayout(String layout) {
        return repository.getByUrlEndingWith(layout);
    }

}
