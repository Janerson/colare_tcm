package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class NaturezaObjetoDetalhada extends BaseEntityID {

    @NotNull
    @NotBlank
    private Integer codNaturezaObjetoDetalhada;

    private String descricaoNaturezaObjetoOutros;
}
