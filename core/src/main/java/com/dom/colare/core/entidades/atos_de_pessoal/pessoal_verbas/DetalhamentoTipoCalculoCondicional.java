
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoTipoCalculoCondicional
 * <p>
 * Detalhamento do Tipo Cálculo Condicional
 * 
 */
public class DetalhamentoTipoCalculoCondicional {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * Valor Maximo
     * (Required)
     * 
     */
    @NotNull
    private Double vlMaximo;
    /**
     * Valor Minimo
     * (Required)
     * 
     */
    @NotNull
    private Double vlMinimo;

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

    /**
     * Valor Maximo
     * (Required)
     * 
     */
    public Double getVlMaximo() {
        return vlMaximo;
    }

    /**
     * Valor Maximo
     * (Required)
     * 
     */
    public void setVlMaximo(Double vlMaximo) {
        this.vlMaximo = vlMaximo;
    }

    /**
     * Valor Minimo
     * (Required)
     * 
     */
    public Double getVlMinimo() {
        return vlMinimo;
    }

    /**
     * Valor Minimo
     * (Required)
     * 
     */
    public void setVlMinimo(Double vlMinimo) {
        this.vlMinimo = vlMinimo;
    }

}
