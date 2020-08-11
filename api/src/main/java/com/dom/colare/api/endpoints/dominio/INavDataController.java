package com.dom.colare.api.endpoints.dominio;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.api.InavDataDTO;
import com.dom.colare.domain.services.api.InavDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${dominio.menu-link}")
public class INavDataController extends BaseController<InavDataDTO, UUID> {

    private InavDataService service;

    @Autowired
    public INavDataController(InavDataService service) {
        super(service);
        this.service = service;
    }

    @GetMapping(path = "SPC/{layout}")
    public InavDataDTO listarPorUrl(@PathVariable("layout") String layout){
        return service.listarPorLayout(layout);
    }

}
