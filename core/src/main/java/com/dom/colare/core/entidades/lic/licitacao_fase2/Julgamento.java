
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * julgamento
 * <p>
 * Julgamento das propostas, por licitante
 * 
 */
@Entity(name = "JULG_FASE2")
@Data
public class Julgamento extends BaseEntityID {

    /**
     * Informar se foi registrado em ata a presença do preposto do licitante
     * (Required)
     * 
     */
    @NotNull
    private Boolean registrouEmAtaPresencaPrepostoDoLicitante;
    /**
     * Informar se o licitante renunciou ao prazo recursal
     * (Required)
     * 
     */
    @NotNull
    private Boolean renunciaPrazoRecursal;

}
