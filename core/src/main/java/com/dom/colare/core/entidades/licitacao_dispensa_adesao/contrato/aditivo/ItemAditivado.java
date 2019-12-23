
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * itemAditivado
 * <p>
 * Dados dos itens aditivados
 * 
 */
public class ItemAditivado {

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
    @NotNull
    public Integer numeroItem;
    /**
     * Valor unitário acrescido
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorUnitarioAcrescido;
    /**
     * Valor unitário decrescido
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorUnitarioDecrescido;
    /**
     * Quantidade acrescida
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double quantidadeAcrescida;
    /**
     * Quantidade decrescida
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double quantidadeDecrescida;

}
