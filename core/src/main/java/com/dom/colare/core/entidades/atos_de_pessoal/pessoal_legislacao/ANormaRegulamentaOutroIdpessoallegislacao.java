
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * aNormaRegulamentaOutroIdpessoallegislacao
 * <p>
 * Informar se a presente Norma, regulamenta outra Norma/Legislação
 * 
 */
public class ANormaRegulamentaOutroIdpessoallegislacao {

    /**
     * Informa se a presente norma regulamenta ou não outra Legislação de Pessoal
     * (Required)
     * 
     */
    @NotNull
    private Boolean normaRegulamentaOutroIDPessoalLegislacao;
    @Valid
    private Set<NormaOuLegislacaoRegulamentada> normaOuLegislacaoRegulamentada = null;

    /**
     * Informa se a presente norma regulamenta ou não outra Legislação de Pessoal
     * (Required)
     * 
     */
    public Boolean getNormaRegulamentaOutroIDPessoalLegislacao() {
        return normaRegulamentaOutroIDPessoalLegislacao;
    }

    /**
     * Informa se a presente norma regulamenta ou não outra Legislação de Pessoal
     * (Required)
     * 
     */
    public void setNormaRegulamentaOutroIDPessoalLegislacao(Boolean normaRegulamentaOutroIDPessoalLegislacao) {
        this.normaRegulamentaOutroIDPessoalLegislacao = normaRegulamentaOutroIDPessoalLegislacao;
    }

    public Set<NormaOuLegislacaoRegulamentada> getNormaOuLegislacaoRegulamentada() {
        return normaOuLegislacaoRegulamentada;
    }

    public void setNormaOuLegislacaoRegulamentada(Set<NormaOuLegislacaoRegulamentada> normaOuLegislacaoRegulamentada) {
        this.normaOuLegislacaoRegulamentada = normaOuLegislacaoRegulamentada;
    }

}
