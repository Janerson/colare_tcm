
package com.dom.colare.core.entidades.fase1;


import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;

/**
 * dotacao
 * <p>
 * Dotação orçamentária
 * 
 */
@Entity(name = "DOTACAO")
@Data
public class Dotacao extends BaseEntityID {

    /**
     * Código do órgão
     * (Required)
     * 
     */
    public Integer codOrgao;
    /**
     * Código da unidade orçamentária
     * (Required)
     * 
     */
    public Integer codUnidadeOrcamentaria;
    /**
     * Código da função
     * (Required)
     * 
     */
    public Integer codFuncao;
    /**
     * Código da Subfunção
     * (Required)
     * 
     */
    public Integer codSubFuncao;
    /**
     * Código do programa
     * (Required)
     * 
     */
    public Integer codPrograma;
    /**
     * Natureza da Ação
     * (Required)
     * 
     */
    public Integer naturezaAcao;
    /**
     * Número do Projeto de Atividade
     * (Required)
     * 
     */
    public Integer nroProjAtiv;
    /**
     * Código da natureza da despesa
     * (Required)
     * 
     */
    public Integer naturezaDespesa;
    /**
     * Subelemento da despesa
     * 
     */
    public Integer subelemento;
    /**
     * Código da fonte de recursos
     * (Required)
     * 
     */
    public Integer codFonteRecursos;
    /**
     * Saldo atual da dotação orçamentária
     * (Required)
     * 
     */
    public Double saldoAtualDaDotacao;
    /**
     * Valor a ser utilizado
     * (Required)
     * 
     */
    public Double valorASerUtilizado;

}
