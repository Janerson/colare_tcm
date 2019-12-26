
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrevisaoDeIsencao
 * <p>
 * Informa os dados sobre a possibilidade de isenção do pagamento de taxa de inscrição.
 * 
 */
public class DetalhamentoPrevisaoDeIsencao {

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
