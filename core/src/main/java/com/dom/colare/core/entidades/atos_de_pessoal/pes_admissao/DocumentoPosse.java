
package com.dom.colare.core.entidades.atos_de_pessoal.pes_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * documentoPosse
 * <p>
 * Documentos para Posse
 * 
 */
@Entity(name = "PES_ADM_DOCPOSS")
@Data
public class DocumentoPosse extends BaseEntityID {

    /**
     * Informar o tipo de documento usado para Posse do servidor.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoDocumentoPosse;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
