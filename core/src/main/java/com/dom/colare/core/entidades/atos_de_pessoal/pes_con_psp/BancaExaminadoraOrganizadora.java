
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * bancaExaminadoraOrganizadora
 * <p>
 * Informar Banca Examinadora Organizadora
 * 
 */
@Entity(name = "PES_CON_BANCA")
@Data
public class BancaExaminadoraOrganizadora extends BaseEntityID {

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
     * (Required)
     * 
     */
    @NotNull
    private Integer idContratoOriginal;


}
