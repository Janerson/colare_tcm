
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * empenho
 * <p>
 * Dados do empenho decorrente do contrato
 * 
 */
public class Empenho {

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
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

}
