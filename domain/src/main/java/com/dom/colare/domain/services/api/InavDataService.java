package com.dom.colare.domain.services.api;

import com.dom.colare.core.entidades.api.inav.INavData;
import com.dom.colare.data.repository.dominio.api.INavDataRepository;
import com.dom.colare.domain.dto.api.InavDataDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class InavDataService extends BaseService<InavDataDTO, UUID, INavData> {

    private INavDataRepository repository;

    @Autowired
    public InavDataService(INavDataRepository repository) {
        super(repository, InavDataDTO.class, INavData.class);
        this.repository = repository;
    }

    @Override
    public List<InavDataDTO> listar() {
        return mapAll(repository.listarTodos(), InavDataDTO.class);
    }

    public Page<InavDataDTO> listar(Pageable pageable) {
        return repository.listar(pageable)
                .map(entity -> modelMapper().map(entity,InavDataDTO.class));
    }

    public InavDataDTO listarPorLayout(String layout) {
        return mapToDTO(repository.getByUrlEndingWith(layout), InavDataDTO.class);
    }

}
