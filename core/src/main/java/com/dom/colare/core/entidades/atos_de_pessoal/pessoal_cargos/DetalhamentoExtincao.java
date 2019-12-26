
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoExtincao
 * <p>
 * Informar o detalhamento da extinção do cargo
 * 
 */
public class DetalhamentoExtincao {

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
     * Data de início da extinção cargo quando vagar
     * (Required)
     * 
     */
    @NotNull
    private String dataInicioEmExtincao;

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

    /**
     * Data de início da extinção cargo quando vagar
     * (Required)
     * 
     */
    public String getDataInicioEmExtincao() {
        return dataInicioEmExtincao;
    }

    /**
     * Data de início da extinção cargo quando vagar
     * (Required)
     * 
     */
    public void setDataInicioEmExtincao(String dataInicioEmExtincao) {
        this.dataInicioEmExtincao = dataInicioEmExtincao;
    }

}
