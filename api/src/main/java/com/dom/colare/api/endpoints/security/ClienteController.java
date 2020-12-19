package com.dom.colare.api.endpoints.security;

import com.dom.colare.api.BaseController;
import com.dom.colare.core.entidades.security.Cliente;
import com.dom.colare.domain.services.security.ClienteDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${dominio.cliente}")
public class ClienteController extends BaseController<Cliente, UUID> {

    @Autowired
    public ClienteController(ClienteDetailService service) {
        super(service);
    }
}
