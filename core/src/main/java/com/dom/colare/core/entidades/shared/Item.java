package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class Item extends BaseEntityID {


    /**
     * Número do Item
     * (Required)
     */
    @DecimalMin("1")
    @NotNull(message = "Obrigatório informar número do item.")
    @Column
    private int numeroItem;

    /**
     * Quantidade
     * (Required)
     */
    @DecimalMin("0")
    @NotNull(message = "Obrigatório informar a quantidade.")
    @Column
    private int quantidade;

    /**
     * Código de Mercadoria ou Serviço dos itens
     */
    @Column
    private int codigoUnicoMercadoriaOuServico;

    /**
     * Código da unidade medida
     * (Required)
     */
    @NotNull(message = "Obrigatório informar unidade de medida.")
    @Column
    private int codUnidadeMedida;

    /**
     * Valor de referência
     * (Required)
     */
    @DecimalMin("0")
    @NotNull(message = "Obrigatório informar valor de referência.")
    @Column
    private double valorDeReferencia;

    /**
     * Código da origem do valor de referência
     * (Required)
     */
    @NotNull(message = "Obrigatório informar origem do valor de referência.")
    @Column
    private int codOrigemValorReferencia;

    /**
     * Quantidade desdobrada (quantas unidades contém a caixa / fardo / pacote)
     */
    @DecimalMin("0")
    @Column
    private int quantidadeDesdobraUnidade;

    /**
     * Descreve onde foi obtido o valor de referência.
     */
    @Column
    private String descricaoOrigemValorReferencia;

}
