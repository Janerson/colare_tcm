
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;


/**
 * quadroSocietario
 * <p>
 * Quadro societário do contratado
 * 
 */
@Data
public class QuadroSocietario {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    private int codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    private String numeroDocumento;
    /**
     * Código do tipo de Participação do Sócio
     * (Required)
     * 
     */
    private int codTipoParticipacao;


}
