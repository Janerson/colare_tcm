
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * textoDaNormaOuLegislacao
 * <p>
 * Anexar os arquivos (Formato PDF-A) referentes ao Texto e/ou Anexos da Norma/Legislação
 * 
 */
@Entity
@Data
public class TextoDaNormaOuLegislacao extends BaseEntityID {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * Informar o código conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoTextoDocumento;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
