package com.dom.colare.data.repository.security;

import com.dom.colare.core.entidades.security.Usuario;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends BaseRespository<Usuario, UUID> {

   Optional<Usuario> findByEmail(String email);

   @Override
   <S extends Usuario> S save(S s);
}
