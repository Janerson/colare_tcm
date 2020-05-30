
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * precoFinal
 * <p>
 * Preço final dos itens licitados
 * 
 */
@Entity(name = "PRECO_FASE2")
@Data
public class PrecoFinal extends BaseEntityID {

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
    @DecimalMin("1")
    @NotNull
    private Integer numeroItem;
    /**
     * Valor Unitário
     * 
     */
    @DecimalMin("0")
    private Double valorUnitario;
    /**
     * Indica se o item foi deserto na licitação
     * (Required)
     * 
     */
    @NotNull
    private Boolean itemDeserto;
    /**
     * indica se o item foi fracassado na licitação.
     * (Required)
     * 
     */
    @NotNull
    private Boolean itemFracassado;

}
