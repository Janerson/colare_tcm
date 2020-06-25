
package com.dom.colare.domain.dto.lic.contrato_adt;


import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

/**
 * empenho
 * <p>
 * Dados do empenho decorrente do contrato aditivo
 * 
 */
@Data
public class EmpenhoDTO extends BaseDTO {

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
