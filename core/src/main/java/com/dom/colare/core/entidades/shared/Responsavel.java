
package com.dom.colare.core.entidades.shared;


import lombok.Data;

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
@Data
public abstract class Responsavel extends BaseEntityID {

    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    @NotNull
    private int codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    private String numeroCpf;



}
