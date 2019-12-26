
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal
 * <p>
 * Informar o numero do item onde contem as clausulas de aprovação e apuração da nota final
 * 
 */
public class DetalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal {

    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    public String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;

}
