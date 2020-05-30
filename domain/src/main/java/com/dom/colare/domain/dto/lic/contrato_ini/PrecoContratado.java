
package com.dom.colare.domain.dto.lic.contrato_ini;


import lombok.Data;

/**
 * precoContratado
 * <p>
 * Preço contratado por item
 * 
 */
@Data
public class PrecoContratado {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    private Integer numeroLote;
    /**
     * Número do Item
     * (Required)
     * 
     */
    private Integer numeroItem;
    /**
     * Valor Unitário
     * (Required)
     * 
     */
    private Double valorUnitario;
    /**
     * Quantidade
     * (Required)
     * 
     */
    private Double quantidade;

}
