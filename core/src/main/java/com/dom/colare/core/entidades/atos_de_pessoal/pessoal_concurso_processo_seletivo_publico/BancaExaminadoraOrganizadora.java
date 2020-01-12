
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

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
@Entity
@Data
public class BancaExaminadoraOrganizadora extends BaseEntityID {

    /**
     * Código do tipo de Banca Examinadora
     * (Required)
     * 
     */
    @NotNull
    public Integer codTipoBancaExaminadora;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * ID do contrato original previamente informado.
     * (Required)
     * 
     */
    @NotNull
    public Integer idContratoOriginal;


}
