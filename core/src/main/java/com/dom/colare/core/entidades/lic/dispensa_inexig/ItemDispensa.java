
package com.dom.colare.core.entidades.lic.dispensa_inexig;

import com.dom.colare.core.entidades.shared.Item;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;


/**
 * item
 * <p>
 * Item(s) dispensado(s) de Licitação
 * 
 */
@Entity(name = "ITEM_DISP")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class ItemDispensa extends Item {
    /**
     * Descrição do Item
     * (Required)
     * 
     */
    @NotNull
    private String descricaoItem;

    /**
     * Data da cotação
     * (Required)
     * 
     */
    @NotNull
    private String dataCotacao;


}
