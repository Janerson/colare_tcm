
package com.dom.colare.core.entidades.atos_de_pessoal.pes_pensionist;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * pensaoJudicial
 * <p>
 * Contém os dados das Pensões Judiciais.
 * 
 */
@Entity(name = "PES_PENS_P_JUD")
@Data
public class PensaoJudicial extends BaseEntityID {

    /**
     * Informa o detalhamento da peça Decisão Judicial, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer detalhamentoPecaJudicial;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;


}
