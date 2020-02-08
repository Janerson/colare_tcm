
package com.dom.colare.core.entidades.shared;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * responsaveis
 * <p>
 * Detalhamento dos Responsáveis pela licitação
 * 
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Responsavel extends BaseEntityID {

    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    @NotNull
    public int codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;



}
