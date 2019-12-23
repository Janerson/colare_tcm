
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * banco
 * <p>
 * Informa os dados do Banco oficial utilizado pela unidade gestora.
 * 
 */
public class Banco {

    /**
     * Informa o código do banco (conforme FEBRABAN e BACEN).
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("999")
    @NotNull
    public Integer codigoBancoOficialPagamentos;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<RemessaBancarium> remessaBancaria = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<RetornoBancario> retornoBancario = null;

}
