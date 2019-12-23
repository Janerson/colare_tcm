
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * precoContratado
 * <p>
 * Preço contratado mediante dispensa de licitação
 * 
 */
public class PrecoContratado {

    /**
     * Número do Item
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroItem;
    /**
     * Valor Unitário
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorUnitario;
    /**
     * Quantidade
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double quantidade;

}
