
package com.dom.colare.domain.dto.licitacao.contrato.recisao;


import lombok.Data;

/**
 * empenhoAnulado
 * <p>
 * Dados dos empenhos anulados em decorrência da rescisão do contrato
 * 
 */
@Data
public class EmpenhoAnuladoDTO {

    /**
     * Número do empenho
     * (Required)
     * 
     */
    private Integer numeroEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    private String dataEmpenho;
    /**
     * Data em que o empenho foi anulado.
     * (Required)
     * 
     */
    private String dataAnulacaoEmpenho;
    /**
     * Valor anulado do empenho
     * (Required)
     * 
     */
    private Double valorAnulacaoEmpenho;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;

}
