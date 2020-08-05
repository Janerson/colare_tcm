package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.api.MenuDTO;
import com.dom.colare.domain.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${dominio.menu-link}")
public class MenuController extends BaseController<MenuDTO, UUID> {

    @Autowired
    public MenuController(MenuService service) {
        super(service);
    }

}
