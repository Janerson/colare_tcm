
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * itemAditivado
 * <p>
 * Dados dos itens aditivados
 * 
 */
@Entity
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
    
    @ManyToOne
    private ContratadoAditivo contratadoAditivo;

}
