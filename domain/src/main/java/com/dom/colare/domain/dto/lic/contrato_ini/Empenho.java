
package com.dom.colare.domain.dto.lic.contrato_ini;


import lombok.Data;

/**
 * empenho
 * <p>
 * Dados do empenho decorrente do contrato
 * 
 */
@Data
public class Empenho {

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
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;
    /**
     * Valor do empenho
     * (Required)
     * 
     */
    private Double valorEmpenho;

}
