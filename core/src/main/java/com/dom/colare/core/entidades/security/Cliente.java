package com.dom.colare.core.entidades.security;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Cliente extends BaseEntityID {

    private String applicationName;
    private String password;
    private Integer accessTokenValiditySeconds;
    private Integer refreshTokenValiditySeconds;

}
