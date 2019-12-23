
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * liquidacao
 * <p>
 * Contém as informações relativas às liquidaçãoes
 * 
 */
public class Liquidacao {

    /**
     * Número da liquidação
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroLiquidacao;
    /**
     * Data da liquidação
     * (Required)
     * 
     */
    @NotNull
    public String dataLiquidacao;
    /**
     * Informa o valor da Liquidacao
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorLiquidacao;

}
