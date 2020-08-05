package com.dom.colare.core.entidades.security;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Usuario extends BaseEntityID {

    private String nome;
    private String sobrenome;
    private String email;
    private String password;

}
