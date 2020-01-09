
package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * quadroSocietario
 * <p>
 * Quadro societário do contratado
 * 
 */
@Entity
@Data
public abstract class QuadroSocietario extends BaseEntityID {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    private String numeroDocumento;
    /**
     * Código do tipo de Participação do Sócio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoParticipacao;

}
