
package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Item;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * ItemFaseUm
 * <p>
 * Cadastro de Itens do Processo Licitatório
 */
@Getter
@Setter
@Entity(name = "ITEM_FASE1")
@PrimaryKeyJoinColumn(name = "codigo")
public class ItemFaseUm extends Item {

    /**
     * Descrição do Item
     * (Required)
     */
    @NotNull(message = "Obrigatório informar a descrição do item")
    private String descricao;

    /**
     * Indica se é o preço máximo
     * (Required)
     */
    @NotNull(message = "Obrigatório informar se é preço máximo")
    private Boolean precoMaximo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOTE_FASE1_ID")
    @JsonBackReference
    private LoteFaseUm loteFaseUm;
}
