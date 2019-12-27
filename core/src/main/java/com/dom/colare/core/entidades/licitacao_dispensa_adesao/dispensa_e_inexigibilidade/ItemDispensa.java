
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

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
@Entity
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
