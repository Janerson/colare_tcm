
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

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
@Entity
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
