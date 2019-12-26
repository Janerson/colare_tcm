
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoDeOutrosRecursosNaoPresenciais
 * <p>
 * Informa a previsão e outros recursos não presenciais para interposição de recurso ou impugnação.
 * 
 */
public class DetalhamentoDeOutrosRecursosNaoPresenciai {

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
