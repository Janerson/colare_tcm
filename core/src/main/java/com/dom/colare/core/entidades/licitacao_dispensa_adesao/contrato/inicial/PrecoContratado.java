
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * precoContratado
 * <p>
 * Preço contratado por item
 * 
 */
public class PrecoContratado {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @NotNull
    public Integer numeroLote;
    /**
     * Número do Item
     * (Required)
     * 
     */
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
