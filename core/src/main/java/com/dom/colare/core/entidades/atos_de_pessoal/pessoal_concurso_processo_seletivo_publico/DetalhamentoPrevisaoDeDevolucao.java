
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrevisaoDeDevolucao
 * <p>
 * Informa o detalhamento da previsão de devolução da taxa de inscrição no caso de cancelamento da Seleção.
 * 
 */
public class DetalhamentoPrevisaoDeDevolucao {

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
