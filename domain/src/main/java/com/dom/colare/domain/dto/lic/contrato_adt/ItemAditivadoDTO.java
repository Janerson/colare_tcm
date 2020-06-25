
package com.dom.colare.domain.dto.lic.contrato_adt;


import lombok.Data;

/**
 * itemAditivado
 * <p>
 * Dados dos itens aditivados
 * 
 */
@Data
public class ItemAditivadoDTO {

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
     * Valor unitário acrescido
     * (Required)
     * 
     */
    private Double valorUnitarioAcrescido;
    /**
     * Valor unitário decrescido
     * (Required)
     * 
     */
    private Double valorUnitarioDecrescido;
    /**
     * Quantidade acrescida
     * (Required)
     * 
     */
    private Double quantidadeAcrescida;
    /**
     * Quantidade decrescida
     * (Required)
     * 
     */
    private Double quantidadeDecrescida;



}
