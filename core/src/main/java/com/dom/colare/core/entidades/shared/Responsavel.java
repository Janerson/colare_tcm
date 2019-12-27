
package com.dom.colare.core.entidades.shared;

import com.dom.colare.core.entidades.dominio.TipoResponsabilidade;

import javax.validation.constraints.NotNull;


/**
 * responsaveis
 * <p>
 * Detalhamento dos Responsáveis pela licitação
 * 
 */
public class Responsavel {

    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    @NotNull
    public TipoResponsabilidade codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;



}
