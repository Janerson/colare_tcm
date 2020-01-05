package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class Licitacao extends BaseEntityID {

    /**
     * Modalidade da Licitação
     * (Required)
     *
     */
    @NotNull
    private Integer codModalidadeLicitacao;
    /**
     * Exercício do edital da licitação
     * (Required)
     *
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    private Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     *
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull
    private Integer numeroLicitacao;
}
