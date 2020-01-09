package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PrecoContratado extends BaseEntityID {

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
     * (Required)
     *
     */
    @DecimalMin("0")
    @NotNull
    private Double valorUnitario;
    /**
     * Quantidade
     * (Required)
     *
     */
    @DecimalMin("0")
    @NotNull
    private Double quantidade;
}
