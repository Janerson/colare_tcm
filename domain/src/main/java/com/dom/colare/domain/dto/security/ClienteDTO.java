package com.dom.colare.domain.dto.security;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

@Data
public class ClienteDTO extends BaseDTO {

    private String applicationName;
    private String password;
    private Long accessTokenValiditySeconds;
    private Long refreshTokenValiditySeconds;
    private final String instructions = "Envie no Authorization Header o UUID do cliente e o password encodado em Base64 " +
            "da seguinte forma Base64(UUID:PASSWORD), por medida de segurança o password é retornado como HASH do tipo BCrypt" +
            "NÃO USE O HASH DO PASSWORD PARA COMPOR O HASH DE AUTHORIZATION";
}
