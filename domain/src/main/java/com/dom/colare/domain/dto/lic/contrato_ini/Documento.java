
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;


/**
 * documentos
 * <p>
 * Documentos relacionados à adesão
 * 
 */
@Data
public class Documento {

    /**
     * Tipo do documento anexado relacionado à adesão
     * (Required)
     * 
     */
    private int codTipoDocumentoAnexadoAdesao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;


}
