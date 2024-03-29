
package com.dom.colare.core.entidades.lic.contrato_adt;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * itemAditivado
 * <p>
 * Dados dos itens aditivados
 * 
 */
@Entity(name = "ITEM_ADT")
@Data
public class ItemAditivado extends BaseEntityID {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Integer numeroLote;
    /**
     * Número do Item
     * (Required)
     * 
     */
    @NotNull
    private Integer numeroItem;
    /**
     * Valor unitário acrescido
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorUnitarioAcrescido;
    /**
     * Valor unitário decrescido
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorUnitarioDecrescido;
    /**
     * Quantidade acrescida
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double quantidadeAcrescida;
    /**
     * Quantidade decrescida
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double quantidadeDecrescida;
    

}
