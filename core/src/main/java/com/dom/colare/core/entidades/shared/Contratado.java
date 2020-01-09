package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Contratado extends BaseEntityID {


    /**
     * Número da Certidão de Regularidade do INSS
     *
     */
    private String numeroCertidaoRegularidadeINSS;
    /**
     * Número da Certidão de Regularidade do FGTS
     *
     */
    private String numeroCertidaoRegularidadeFGTS;
    /**
     * Número da Certidão negativa de Débitos Trabalhistas
     *
     */
    private String numeroCNDT;
}
