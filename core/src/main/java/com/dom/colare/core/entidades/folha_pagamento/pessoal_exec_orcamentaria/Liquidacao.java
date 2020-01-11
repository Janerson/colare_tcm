
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * liquidacao
 * <p>
 * Contém as informações relativas às liquidaçãoes
 * 
 */
@Entity
@Data
public class Liquidacao extends BaseEntityID {

    /**
     * Número da liquidação
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroLiquidacao;
    /**
     * Data da liquidação
     * (Required)
     * 
     */
    @NotNull
    private String dataLiquidacao;
    /**
     * Informa o valor da Liquidacao
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorLiquidacao;

}
