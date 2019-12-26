
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import javax.validation.constraints.NotNull;


/**
 * periodoInscricaoConcurso
 * <p>
 * Informa Periodo Inscrição da Seleção
 * 
 */
public class PeriodoInscricaoConcurso {

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
