
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * certidaoResponsabilidadeFiscal
 * <p>
 * Informa a Certidão de Responsabilidade Fiscal
 * 
 */
public class CertidaoResponsabilidadeFiscal {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

}
