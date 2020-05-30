
package com.dom.colare.core.entidades.atos_de_pessoal.pes_procselsimp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoBancaExaminadora
 * <p>
 * Informa Detalhamento Banca Examinadora
 * 
 */
@Entity(name = "PES_PSS_BANCA")
@Data
public class DetalhamentoBancaExaminadora extends BaseEntityID {

    /**
     * Código do tipo de Banca Examinadora
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoBancaExaminadora;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * ID do contrato original previamente informado.
     * 
     */
    private Integer idContratoOriginal;



}
