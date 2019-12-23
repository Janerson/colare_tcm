
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * numeroEmpenho
 * <p>
 * Informa os dados do empenho e seus desdobramentos.
 * 
 */
public class NumeroEmpenho {

    /**
     * Número do empenho
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroEmpenho;
    /**
     * Valor do empenho
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    @NotNull
    public String dataEmpenho;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Liquidacao> liquidacao = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<OrdemDePagamento> ordemDePagamento = null;

}
