
package com.dom.colare.domain.dto.lic.contrato_adt;

import lombok.Data;

/**
 * quadroSocietario
 * <p>
 * Quadro societário do contratado
 * 
 */
@Data
public class QuadroSocietarioDTO  {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    private Long codTipoDocumento;
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
    private Long codTipoParticipacao;




}
