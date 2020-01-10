package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class RecursoOrcamentario extends BaseEntityID {

    /**
     * Código da origem do recurso
     * (Required)
     *
     */
    @NotNull
    private int codOrigemRecurso;


    private int idConvenio;



}
