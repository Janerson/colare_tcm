package com.dom.colare.core.entidades.shared;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um.Dotacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

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
    public int codOrigemRecurso;
    /**
     *
     * (Required)
     *
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Dotacao> dotacao = null;


}
