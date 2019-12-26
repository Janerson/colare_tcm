
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * acumulacaoDeCargos
 * <p>
 * Informar Acumulação de Cargo
 * 
 */
public class AcumulacaoDeCargos {

    /**
     * Informa se o servidor acumula cargo quando do momento da posse no serviço público.
     * (Required)
     * 
     */
    @NotNull
    private Boolean acumulaCargo;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<DadosDaAcumulacao> dadosDaAcumulacao = null;

    /**
     * Informa se o servidor acumula cargo quando do momento da posse no serviço público.
     * (Required)
     * 
     */
    public Boolean getAcumulaCargo() {
        return acumulaCargo;
    }

    /**
     * Informa se o servidor acumula cargo quando do momento da posse no serviço público.
     * (Required)
     * 
     */
    public void setAcumulaCargo(Boolean acumulaCargo) {
        this.acumulaCargo = acumulaCargo;
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

    /**
     * 
     * (Required)
     * 
     */
    public Set<DadosDaAcumulacao> getDadosDaAcumulacao() {
        return dadosDaAcumulacao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDadosDaAcumulacao(Set<DadosDaAcumulacao> dadosDaAcumulacao) {
        this.dadosDaAcumulacao = dadosDaAcumulacao;
    }

}
