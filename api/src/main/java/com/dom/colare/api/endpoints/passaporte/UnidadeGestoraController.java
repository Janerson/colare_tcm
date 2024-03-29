package com.dom.colare.api.endpoints.passaporte;

import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.passaporte.UnidadeGestora;
import com.dom.colare.domain.services.passaporte.UnidadeGestoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("${dominio.unidades-gestoras}")
public class UnidadeGestoraController extends BaseController<UnidadeGestora, UUID> {

    private final UnidadeGestoraService service;

    @Autowired
    public UnidadeGestoraController(UnidadeGestoraService service) {
        super(service);
        this.service = service;
    }

    public void listInsert(@RequestBody List<UnidadeGestora> unidadeGestoras){

    }

}
