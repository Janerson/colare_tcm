
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * mapaDePrecos
 * <p>
 * Melhor lance ou proposta apresentada por licitante, por item
 * 
 */
public class MapaDePreco {

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
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorUnitario;

}
