package com.dom.colare.core.entidades.tcm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dominio {
    private long codigo;
    private String descricao;
    private String vigencia;
}
