
package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


/**
 * textoEdital
 * <p>
 * Informa o texto do edital e anexo
 * 
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TextoEdital extends BaseEntityID {

    /**
     * Código do tipo de documento enviado - Edital e Anexos, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEditalAnexos;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;


}
