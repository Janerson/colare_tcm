package com.dom.colare.domain.dto;

import lombok.Data;

@Data
public class ArquivoDTO extends BaseDTO {

    private long id;
    private long ano;
    private long mes;
    private long idRepresentacao;
    private String recibo;
    private String statusEnvio;
    private String arquivoHomologacao;
    private String layoutSigla;
    private String prestacaoDeContasSigla;
}
