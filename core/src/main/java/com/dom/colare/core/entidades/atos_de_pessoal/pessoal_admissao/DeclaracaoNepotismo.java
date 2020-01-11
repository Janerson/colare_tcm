
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * declaracaoNepotismo
 * <p>
 * Informa se o servidor enquadra-se em situação de nepotismo no ato da posse, conforme Sumula nº 13 do STF. 
 * 
 */
@Entity
@Data
public class DeclaracaoNepotismo extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * Declara se o servidor possui vinculo familiar que caracterize nepotismo, nos termos da Sumula nº13 do STF.
     * (Required)
     * 
     */
    @NotNull
    private Boolean enquadraSituacaoNepotismo;

}
