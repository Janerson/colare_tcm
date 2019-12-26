
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * periodoDeInscricao
 * <p>
 * Detalhamento do período de inscrição da Seleção.
 * 
 */
public class PeriodoDeInscricao {

    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    public String dataInicio;
    /**
     * Data fim
     * (Required)
     * 
     */
    @NotNull
    public String dataFinal;
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
