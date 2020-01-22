package com.dom.colare.dto.dominio;

import lombok.Data;

import java.util.List;

@Data
public class TipoDominio {

    private String nomeTipoDominio;
    private List<Dominio> dominios;

}
