
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * ordemDePagamento
 * <p>
 * Contm as informações sobre as Ordens de Pagamento
 * 
 */
public class OrdemDePagamento {

    /**
     * Número da Ordem de Pagamento
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroOP;
    /**
     * Data do pagamento
     * (Required)
     * 
     */
    @NotNull
    public String dataPagamento;
    /**
     * Informa o valor do pagamento
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorPagamento;

}
