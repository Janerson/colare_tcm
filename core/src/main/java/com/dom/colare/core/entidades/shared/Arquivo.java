package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Arquivo extends BaseEntityID {

    @Column
    private long id;
    @Column
    private int ano;
    @Column
    private int mes;
    @Column
    private int idRepresentacao;
    @Column
    private String recibo;
    @Column
    private String statusEnvio;
    @Column
    private String arquivoHomologacao;
    @Column
    private String layoutSigla;
    @Column
    private String prestacaoDeContasSigla;
}
