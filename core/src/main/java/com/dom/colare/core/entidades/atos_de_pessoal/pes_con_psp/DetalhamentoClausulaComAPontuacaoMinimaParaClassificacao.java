
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoClausulaComAPontuacaoMinimaParaClassificacao
 * <p>
 * Informar o item do edital que contem a clausula que informa pontuação miníma para classificação.
 * 
 */
@Entity(name = "PES_CONMENORPON")
@Data
public class DetalhamentoClausulaComAPontuacaoMinimaParaClassificacao extends BaseEntityID {

    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;

}
