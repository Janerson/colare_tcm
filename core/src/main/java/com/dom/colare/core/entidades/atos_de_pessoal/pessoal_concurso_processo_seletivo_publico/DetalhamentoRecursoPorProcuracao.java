
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoRecursoPorProcuracao
 * <p>
 * Informa dados sobre a previsão de recurso ou impugnação por procuração
 * 
 */
public class DetalhamentoRecursoPorProcuracao {

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
