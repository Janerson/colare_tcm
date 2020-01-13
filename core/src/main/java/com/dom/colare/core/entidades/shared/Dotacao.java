package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dotacao extends BaseEntityID {
    /**
     * Código do órgão
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer codOrgao;
    /**
     * Código da unidade orçamentária
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer codUnidadeOrcamentaria;

    /**
     * Código da função
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer codFuncao;
    /**
     * Código da Subfunção
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer codSubFuncao;
    /**
     * Código do programa
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer codPrograma;


    /**
     * Natureza da Ação
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer naturezaAcao;
    /**
     * Número do Projeto de Atividade
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer nroProjAtiv;
    /**
     * Código da natureza da despesa
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer naturezaDespesa;


    /**
     * Subelemento da despesa
     *
     */
    @DecimalMin("1")
    private Integer subelemento;
    /**
     * Código da fonte de recursos
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer codFonteRecursos;
    /**
     * Saldo atual da dotação orçamentária
     * (Required)
     *
     */
    @NotNull
    private Double saldoAtualDaDotacao;
    /**
     * Valor a ser utilizado
     * (Required)
     *
     */
    @DecimalMin("0")
    @NotNull
    private Double valorASerUtilizado;
}
