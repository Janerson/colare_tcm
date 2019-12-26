
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.constraints.NotNull;


/**
 * padraonivel
 * <p>
 * Informar os dados do Padrão Nível.
 * 
 */
public class Padraonivel {

    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    @NotNull
    private Integer codPadraoNivel;
    /**
     * Descrição da nomenclatura do Padrão ou Nível, conforme Legislação.
     * (Required)
     * 
     */
    @NotNull
    private String descricaoPadraoNivel;
    /**
     * Valor do Vencimento/Subsídio do Cargo para o referido Classe e Padrão
     * (Required)
     * 
     */
    @NotNull
    private Double valorVencimentoOuSubsidio;
    /**
     * Informar valor Gratificação Representação Cargo em Comissão 
     * 
     */
    private Double valorRepresentacao;

    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    public Integer getCodPadraoNivel() {
        return codPadraoNivel;
    }

    /**
     * Codificação, interna do sistema de gestão, para a Padrão ou Nível
     * (Required)
     * 
     */
    public void setCodPadraoNivel(Integer codPadraoNivel) {
        this.codPadraoNivel = codPadraoNivel;
    }

    /**
     * Descrição da nomenclatura do Padrão ou Nível, conforme Legislação.
     * (Required)
     * 
     */
    public String getDescricaoPadraoNivel() {
        return descricaoPadraoNivel;
    }

    /**
     * Descrição da nomenclatura do Padrão ou Nível, conforme Legislação.
     * (Required)
     * 
     */
    public void setDescricaoPadraoNivel(String descricaoPadraoNivel) {
        this.descricaoPadraoNivel = descricaoPadraoNivel;
    }

    /**
     * Valor do Vencimento/Subsídio do Cargo para o referido Classe e Padrão
     * (Required)
     * 
     */
    public Double getValorVencimentoOuSubsidio() {
        return valorVencimentoOuSubsidio;
    }

    /**
     * Valor do Vencimento/Subsídio do Cargo para o referido Classe e Padrão
     * (Required)
     * 
     */
    public void setValorVencimentoOuSubsidio(Double valorVencimentoOuSubsidio) {
        this.valorVencimentoOuSubsidio = valorVencimentoOuSubsidio;
    }

    /**
     * Informar valor Gratificação Representação Cargo em Comissão 
     * 
     */
    public Double getValorRepresentacao() {
        return valorRepresentacao;
    }

    /**
     * Informar valor Gratificação Representação Cargo em Comissão 
     * 
     */
    public void setValorRepresentacao(Double valorRepresentacao) {
        this.valorRepresentacao = valorRepresentacao;
    }

}
