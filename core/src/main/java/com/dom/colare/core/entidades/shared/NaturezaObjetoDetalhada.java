package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class NaturezaObjetoDetalhada extends BaseEntityID {

    @NotNull
    private Integer codNaturezaObjetoDetalhada;

    private String descricaoNaturezaObjetoOutros;
}
