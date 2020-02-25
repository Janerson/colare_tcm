package com.dom.colare.domain.services;

import com.dom.colare.data.repository.dominio.api.MenuRepository;
import com.dom.colare.core.entidades.api.Menu;
import com.dom.colare.domain.dto.MenuDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService extends BaseService<MenuDTO, Long, Menu> {

    @Autowired
    public MenuService(MenuRepository repository) {
        super(repository,MenuDTO.class, Menu.class);
    }

}
