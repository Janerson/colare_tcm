package com.dom.colare.domain.dto.security;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

@Data
public class UsuarioDTO extends BaseDTO {

    private String nome;
    private String sobrenome;
    private String email;
    private String password;
}
