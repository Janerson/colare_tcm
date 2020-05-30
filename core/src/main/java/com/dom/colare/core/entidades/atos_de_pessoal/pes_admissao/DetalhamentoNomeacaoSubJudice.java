
package com.dom.colare.core.entidades.atos_de_pessoal.pes_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoNomeacaoSubJudice
 * <p>
 * informar o Detalhamento da Nomeacao Sub Judice
 * 
 */
@Entity(name = "PES_ADM_DETJUD")
@Data
public class DetalhamentoNomeacaoSubJudice extends BaseEntityID {

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
