
package com.dom.colare.core.entidades.folha_pagamento.pes_folhapag;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalFolhaDePagamento
 * <p>
 * Contém as informações relacionadas à Folha de Pagamento.
 * 
 */
@Entity(name = "PES_FOLHAPAG")
@Data
public class PessoalFolhaDePagamento extends BaseEntityID {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * Informar o mês de competência da folha de pagamento 
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("13")
    @NotNull
    private Integer mesCompetencia;
    /**
     * Informar o ano de competência da Folha de Pagamento
     * (Required)
     * 
     */
    @DecimalMin("2020")
    @NotNull
    private Integer anoCompetencia;
    /**
     * Informa o tipo de Unidade Gestora Responsável pela Folha, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoUnidadeGestoraResponsavelFolha;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_FOLHAPAG_ID")
    private Set<FolhaDePagamento> folhaDePagamento = new HashSet<>();

    
}
