package com.dom.colare.api.endpoints.security;

import com.dom.colare.api.BaseController;
import com.dom.colare.domain.dto.security.UsuarioDTO;
import com.dom.colare.domain.services.security.UsuarioDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${dominio.usuario}")
public class UsuarioController extends BaseController<UsuarioDTO, UUID> {

    @Autowired
    public UsuarioController(UsuarioDetailService usuarioDetailService) {
        super(usuarioDetailService);
    }
}
