package com.dom.colare.security.token;

import com.dom.colare.domain.services.security.UsuarioToken;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

public class CustomTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        UsuarioToken usuarioToken = (UsuarioToken) oAuth2Authentication.getPrincipal();

        Map<String,Object> addInfo = new HashMap<>();
        addInfo.put("user_id",usuarioToken.getUsuario().getUuid());
        addInfo.put("nome",usuarioToken.getUsuario().getNome());
        addInfo.put("sobrenome",usuarioToken.getUsuario().getSobrenome());

        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(addInfo);

        return oAuth2AccessToken;
    }
}
