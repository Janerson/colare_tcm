package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class Parecer extends BaseEntityID {
    /**
     * Data do parecer
     * (Required)
     *
     */
    @NotNull
    public String dataParecer;
    /**
     * Código do Tipo do parecer
     * (Required)
     *
     */
    @NotNull
    public int codTipoParecer;
    /**
     * Número do CPF
     * (Required)
     *
     */
    @NotNull
    public String numeroCpf;
    /**
     * Número do registro no órgão de classe
     * (Required)
     *
     */
    @NotNull
    public String numeroRegistroOrgaoDeClasse;
    /**
     * Código IBGE do Estado onde foi realizado o registro no órgão de classe
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    public Integer codUfRegistroOrgaoDeClasse;
}
