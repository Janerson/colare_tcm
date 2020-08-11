package com.dom.colare.domain.services.security;

import com.dom.colare.core.entidades.security.Usuario;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Data
public class UsuarioToken extends User {

    private Usuario usuario;

    public UsuarioToken(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
        super(usuario.getEmail(), usuario.getPassword(), authorities);
        this.usuario = usuario;
    }

}

