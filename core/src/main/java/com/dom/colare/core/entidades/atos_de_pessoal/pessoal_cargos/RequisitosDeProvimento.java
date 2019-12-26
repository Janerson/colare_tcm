
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.constraints.NotNull;


/**
 * requisitosDeProvimento
 * <p>
 * Informar os requisitos de provimento do cargo
 * 
 */
public class RequisitosDeProvimento {

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
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;

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
     * Descrição
     * (Required)
     * 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Descrição
     * (Required)
     * 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}