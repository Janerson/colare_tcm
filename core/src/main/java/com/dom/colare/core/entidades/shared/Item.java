package com.dom.colare.core.entidades.shared;

import lombok.Data;

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
    @NotNull
    private int numeroItem;
    /**
     * Quantidade
     * (Required)
     */
    @DecimalMin("0")
    @NotNull
    private int quantidade;
    /**
     * Código de Mercadoria ou Serviço dos itens
     */
    private int codigoUnicoMercadoriaOuServico;

    /**
     * Código da unidade medida
     * (Required)
     */
    @NotNull
    private int codUnidadeMedida;
    /**
     * Valor de referência
     * (Required)
     */
    @DecimalMin("0")
    @NotNull
    private double valorDeReferencia;
    /**
     * Código da origem do valor de referência
     * (Required)
     */
    @NotNull
    private int codOrigemValorReferencia;
    /**
     * Quantidade desdobrada (quantas unidades contém a caixa / fardo / pacote)
     */
    @DecimalMin("0")
    private int quantidadeDesdobraUnidade;
    /**
     * Descreve onde foi obtido o valor de referência.
     */
    private String descricaoOrigemValorReferencia;

}
