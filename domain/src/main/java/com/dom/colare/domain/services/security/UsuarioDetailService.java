package com.dom.colare.domain.services.security;

import com.dom.colare.core.entidades.security.Usuario;
import com.dom.colare.data.repository.security.UsuarioRepository;
import com.dom.colare.domain.dto.security.UsuarioDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
public class UsuarioDetailService extends BaseService<UsuarioDTO, UUID, Usuario> implements UserDetailsService {

    private final UsuarioRepository repository;

    public UsuarioDetailService(UsuarioRepository repository) {
        super(repository, UsuarioDTO.class, Usuario.class);
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário e/ou senha incorretos"));

        //return new User(usuario.getEmail(), usuario.getPassword(), gerPermissoes(usuario));
        return new UsuarioToken(usuario,gerPermissoes(usuario));
    }

    private Collection<? extends GrantedAuthority> gerPermissoes(Usuario usuario) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("CREATE"));
        authorities.add(new SimpleGrantedAuthority("READ"));
        authorities.add(new SimpleGrantedAuthority("UPDATE"));
        authorities.add(new SimpleGrantedAuthority("DELETE"));
        authorities.add(new SimpleGrantedAuthority("LIST"));
        return authorities;
    }

}
