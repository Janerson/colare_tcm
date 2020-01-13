
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * codificacaoNaturezaDespesa
 * <p>
 * Informa os Dados da Codificação Natureza Despesa
 * 
 */
@Entity(name = "PES_VER_ND")
@Data
public class CodificacaoNaturezaDespesa extends BaseEntityID {

    /**
     * Informa a Categoria Economica da Despesa
     * (Required)
     * 
     */
    @NotNull
    private Integer codCategoriaEconomica;
    /**
     * Informa o Grupo da Natureza de Despesa
     * (Required)
     * 
     */
    @NotNull
    private Integer codGrupoNaturezaDespesa;
    /**
     * Informa a Modalidade de Aplicacao
     * (Required)
     * 
     */
    @NotNull
    private Integer codModalidadeAplicacao;
    /**
     * Informa Elemento Despesa
     * (Required)
     * 
     */
    @NotNull
    private Integer codElementoDespesa;
    /**
     * Subelemento da despesa
     * (Required)
     * 
     */
    @NotNull
    private Integer subelemento;


}
