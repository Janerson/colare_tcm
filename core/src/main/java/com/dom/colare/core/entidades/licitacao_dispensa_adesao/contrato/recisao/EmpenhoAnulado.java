
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * empenhoAnulado
 * <p>
 * Dados dos empenhos anulados em decorrência da rescisão do contrato
 * 
 */
public class EmpenhoAnulado {

    /**
     * Número do empenho
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    @NotNull
    public String dataEmpenho;
    /**
     * Data em que o empenho foi anulado.
     * (Required)
     * 
     */
    @NotNull
    public String dataAnulacaoEmpenho;
    /**
     * Valor anulado do empenho
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorAnulacaoEmpenho;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

}
