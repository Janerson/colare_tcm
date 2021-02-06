package com.dom.colare.api.endpoints.security;

import com.dom.colare.api.endpoints.BaseController;
import com.dom.colare.core.entidades.security.Usuario;
import com.dom.colare.domain.services.security.UsuarioDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("${dominio.usuario}")
public class UsuarioController extends BaseController<Usuario, UUID> {

    @Autowired
    public UsuarioController(UsuarioDetailService usuarioDetailService) {
        super(usuarioDetailService);
    }
}
