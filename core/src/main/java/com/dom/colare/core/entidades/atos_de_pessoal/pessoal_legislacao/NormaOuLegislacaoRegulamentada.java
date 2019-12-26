
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import javax.validation.constraints.NotNull;


/**
 * normaOuLegislacaoRegulamentada
 * <p>
 * Lista de Normas que a presente Norma regulamenta
 * 
 */
public class NormaOuLegislacaoRegulamentada {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    public Integer getIdPessoalLegislacao() {
        return idPessoalLegislacao;
    }

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    public void setIdPessoalLegislacao(Integer idPessoalLegislacao) {
        this.idPessoalLegislacao = idPessoalLegislacao;
    }

}
