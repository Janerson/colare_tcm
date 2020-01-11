
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * pensaoMerce
 * <p>
 * Contem as informações Pensão Mercê.
 * 
 */
@Entity
@Data
public class PensaoMerce extends BaseEntityID {

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    @NotNull
    private Integer idCadastroPessoal;
    /**
     * Informa qual o tipo documento concedeu Pensão Mercê
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoDocumentoConcessaoPensaoMerce;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
