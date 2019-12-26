
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoPontosDasQuestoesAnuladas
 * <p>
 * Informa a previsão de, no caso de anulação de alguma questão, atribuir-se pontuação a todos candidatos.
 * 
 */
public class DetalhamentoPontosDasQuestoesAnulada {

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
