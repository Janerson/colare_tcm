
package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Item;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * ItemFaseUm
 * <p>
 * Cadastro de Itens do Processo Licitatório
 */
@Entity(name = "ITEM_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "codigo")
public class ItemFaseUm extends Item {

    /**
     * Descrição do Item
     * (Required)
     */
    @NotNull
    private String descricao;

    /**
     * Indica se é o preço máximo
     * (Required)
     */
    @NotNull
    private Boolean precoMaximo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOTE_FASE1_ID")
    private LoteFaseUm lote;
}
