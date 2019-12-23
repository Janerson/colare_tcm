
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * precoFinal
 * <p>
 * Preço final dos itens licitados
 * 
 */
public class PrecoFinal {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer numeroLote;
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
     * 
     */
    @DecimalMin("0")
    public Double valorUnitario;
    /**
     * Indica se o item foi deserto na licitação
     * (Required)
     * 
     */
    @NotNull
    public Boolean itemDeserto;
    /**
     * indica se o item foi fracassado na licitação.
     * (Required)
     * 
     */
    @NotNull
    public Boolean itemFracassado;

}
