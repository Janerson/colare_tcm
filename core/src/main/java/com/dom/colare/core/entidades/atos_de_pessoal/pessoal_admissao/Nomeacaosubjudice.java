
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * nomeacaosubjudice
 * <p>
 * Informar os dados de nomeação Sub Judice
 * 
 */
public class Nomeacaosubjudice {

    /**
     * Informa se a nomeação foi ordenada por decisão judicial.
     * (Required)
     * 
     */
    @NotNull
    private Boolean candidatoNomeacaoSubJudice;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<DetalhamentoNomeacaoSubJudice> detalhamentoNomeacaoSubJudice = null;

    /**
     * Informa se a nomeação foi ordenada por decisão judicial.
     * (Required)
     * 
     */
    public Boolean getCandidatoNomeacaoSubJudice() {
        return candidatoNomeacaoSubJudice;
    }

    /**
     * Informa se a nomeação foi ordenada por decisão judicial.
     * (Required)
     * 
     */
    public void setCandidatoNomeacaoSubJudice(Boolean candidatoNomeacaoSubJudice) {
        this.candidatoNomeacaoSubJudice = candidatoNomeacaoSubJudice;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Set<DetalhamentoNomeacaoSubJudice> getDetalhamentoNomeacaoSubJudice() {
        return detalhamentoNomeacaoSubJudice;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDetalhamentoNomeacaoSubJudice(Set<DetalhamentoNomeacaoSubJudice> detalhamentoNomeacaoSubJudice) {
        this.detalhamentoNomeacaoSubJudice = detalhamentoNomeacaoSubJudice;
    }

}
