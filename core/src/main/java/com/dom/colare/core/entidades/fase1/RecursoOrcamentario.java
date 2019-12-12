
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;


/**
 * recursoOrcamentario
 * <p>
 * Detalhamento dos Recursos Orçamentários
 * 
 */
@Entity
@Data
public class RecursoOrcamentario extends BaseEntityID {

    /**
     * Código da origem do recurso
     * (Required)
     * 
     */
    public Integer codOrigemRecurso;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Dotacao> dotacao = null;



}
