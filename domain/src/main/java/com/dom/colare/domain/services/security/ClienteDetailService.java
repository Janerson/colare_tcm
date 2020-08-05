package com.dom.colare.domain.services.security;

import com.dom.colare.core.entidades.security.Cliente;
import com.dom.colare.data.repository.security.ClienteRepository;
import com.dom.colare.domain.dto.security.ClienteDTO;
import com.dom.colare.domain.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.UUID;

@Service
public class ClienteDetailService extends BaseService<ClienteDTO, UUID, Cliente> implements ClientDetailsService {

    private final ClienteRepository repository;

    @Autowired
    public ClienteDetailService(ClienteRepository repository) {
        super(repository, ClienteDTO.class, Cliente.class);
        this.repository = repository;
    }

    @Override
    public ClientDetails loadClientByClientId(String uuid) throws ClientRegistrationException {
        Cliente  cliente = repository.findById(UUID.fromString(uuid))
                .orElseThrow(() -> new UsernameNotFoundException("Cliente ID e/ou senha incorretos"));

        BaseClientDetails client = new BaseClientDetails();
        client.setClientId(uuid);
        client.setClientSecret(cliente.getPassword());
        client.setScope(Arrays.asList("read","write"));
        client.setAuthorizedGrantTypes(Arrays.asList("password","refresh_token"));
        client.setAccessTokenValiditySeconds(cliente.getAccessTokenValiditySeconds());
        client.setRefreshTokenValiditySeconds(cliente.getRefreshTokenValiditySeconds());
        return client;
    }
}
