
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * certidaoResponsabilidadeFiscal
 * <p>
 * Informa a Certidão de Responsabilidade Fiscal
 * 
 */
@Entity(name = "PES_CON_CERTRSF")
@Data
public class CertidaoResponsabilidadeFiscal extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
