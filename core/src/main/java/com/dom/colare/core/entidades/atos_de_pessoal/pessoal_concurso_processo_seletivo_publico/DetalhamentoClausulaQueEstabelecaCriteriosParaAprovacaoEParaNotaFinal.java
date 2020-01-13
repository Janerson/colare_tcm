
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal
 * <p>
 * Informar o numero do item onde contem as clausulas de aprovação e apuração da nota final
 * 
 */
@Entity(name = "PES_CON_CARGCLA")
@Data
public class DetalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal extends BaseEntityID {

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
