
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import javax.validation.constraints.NotNull;


/**
 * declaracaoNepotismo
 * <p>
 * Informa se o servidor enquadra-se em situação de nepotismo no ato da posse, conforme Sumula nº 13 do STF. 
 * 
 */
public class DeclaracaoNepotismo {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * Declara se o servidor possui vinculo familiar que caracterize nepotismo, nos termos da Sumula nº13 do STF.
     * (Required)
     * 
     */
    @NotNull
    private Boolean enquadraSituacaoNepotismo;

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

    /**
     * Declara se o servidor possui vinculo familiar que caracterize nepotismo, nos termos da Sumula nº13 do STF.
     * (Required)
     * 
     */
    public Boolean getEnquadraSituacaoNepotismo() {
        return enquadraSituacaoNepotismo;
    }

    /**
     * Declara se o servidor possui vinculo familiar que caracterize nepotismo, nos termos da Sumula nº13 do STF.
     * (Required)
     * 
     */
    public void setEnquadraSituacaoNepotismo(Boolean enquadraSituacaoNepotismo) {
        this.enquadraSituacaoNepotismo = enquadraSituacaoNepotismo;
    }

}
