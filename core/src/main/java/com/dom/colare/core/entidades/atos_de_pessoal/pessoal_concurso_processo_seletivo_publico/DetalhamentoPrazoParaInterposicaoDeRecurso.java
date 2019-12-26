
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrazoParaInterposicaoDeRecurso
 * <p>
 * Informa os dados sobre a previsão prazo para interposição de recurso.
 * 
 */
public class DetalhamentoPrazoParaInterposicaoDeRecurso {

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
