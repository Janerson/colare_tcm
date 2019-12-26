
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * dotacao
 * <p>
 * Dotação orçamentária
 * 
 */
public class Dotacao {

    /**
     * Código do órgão
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codOrgao;
    /**
     * Código da unidade orçamentária
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codUnidadeOrcamentaria;
    /**
     * Código da função
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codFuncao;
    /**
     * Código da Subfunção
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codSubFuncao;
    /**
     * Código do programa
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codPrograma;
    /**
     * Natureza da Ação
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer naturezaAcao;
    /**
     * Número do Projeto de Atividade
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer nroProjAtiv;
    /**
     * Código da natureza da despesa
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer naturezaDespesa;
    /**
     * Subelemento da despesa
     * 
     */
    @DecimalMin("1")
    public Integer subelemento;
    /**
     * Código da fonte de recursos
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codFonteRecursos;
    /**
     * Saldo atual da dotação orçamentária
     * (Required)
     * 
     */
    @NotNull
    public Double saldoAtualDaDotacao;
    /**
     * Valor a ser utilizado
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorASerUtilizado;

}