package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.api.BaseController;
import com.dom.colare.data.repository.dominio.api.MenuRepository;
import com.dom.colare.domain.api.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${dominio.menu-link}")
public class MenuController extends BaseController<Menu, Long, MenuRepository> {
    public MenuController(MenuRepository repository) {
        super(repository);
    }
}
