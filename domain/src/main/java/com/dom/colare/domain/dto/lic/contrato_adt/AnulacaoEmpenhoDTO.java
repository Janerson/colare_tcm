
package com.dom.colare.domain.dto.lic.contrato_adt;



/**
 * anulacaoEmpenho
 * <p>
 * Dados da anulação de empenho decorrente de aditivo de decréscimo
 * 
 */
public class AnulacaoEmpenhoDTO {

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

    /**
     * Número do empenho
     * (Required)
     * 
     */
    public Integer getNumeroEmpenho() {
        return numeroEmpenho;
    }

    /**
     * Número do empenho
     * (Required)
     * 
     */
    public void setNumeroEmpenho(Integer numeroEmpenho) {
        this.numeroEmpenho = numeroEmpenho;
    }

    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    public String getDataEmpenho() {
        return dataEmpenho;
    }

    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    public void setDataEmpenho(String dataEmpenho) {
        this.dataEmpenho = dataEmpenho;
    }

    /**
     * Data em que o empenho foi anulado.
     * (Required)
     * 
     */
    public String getDataAnulacaoEmpenho() {
        return dataAnulacaoEmpenho;
    }

    /**
     * Data em que o empenho foi anulado.
     * (Required)
     * 
     */
    public void setDataAnulacaoEmpenho(String dataAnulacaoEmpenho) {
        this.dataAnulacaoEmpenho = dataAnulacaoEmpenho;
    }

    /**
     * Valor anulado do empenho
     * (Required)
     * 
     */
    public Double getValorAnulacaoEmpenho() {
        return valorAnulacaoEmpenho;
    }

    /**
     * Valor anulado do empenho
     * (Required)
     * 
     */
    public void setValorAnulacaoEmpenho(Double valorAnulacaoEmpenho) {
        this.valorAnulacaoEmpenho = valorAnulacaoEmpenho;
    }

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public String getIdDocumentoPDF() {
        return idDocumentoPDF;
    }

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public void setIdDocumentoPDF(String idDocumentoPDF) {
        this.idDocumentoPDF = idDocumentoPDF;
    }

}
