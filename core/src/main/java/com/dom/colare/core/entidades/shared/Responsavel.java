
package com.dom.colare.core.entidades.shared;

import com.dom.colare.core.entidades.dominio.TipoResponsabilidade;

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
    @OneToOne
    @JoinColumn(name = "codTipoResponsabilidade", referencedColumnName = "codigo")
    public TipoResponsabilidade codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;



}
