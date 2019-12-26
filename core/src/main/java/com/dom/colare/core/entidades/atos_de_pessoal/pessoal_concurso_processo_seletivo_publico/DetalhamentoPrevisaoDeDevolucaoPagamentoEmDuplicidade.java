
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade
 * <p>
 * Informa os dados da previsão de devolução da taxa de inscrição no caso de pagamento em duplicidade.
 * 
 */
public class DetalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade {

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
