package com.dom.colare.data.repository.security;

import com.dom.colare.core.entidades.security.Cliente;
import com.dom.colare.data.repository.BaseRespository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends BaseRespository<Cliente, UUID> {


}
