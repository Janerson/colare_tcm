
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoDedicacaoExclusiva
 * <p>
 * Informar os detalhes da dedicação exclusiva
 * 
 */
public class DetalhamentoDedicacaoExclusiva {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    @NotNull
    private String artigo;

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

    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    public String getArtigo() {
        return artigo;
    }

    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }

}
