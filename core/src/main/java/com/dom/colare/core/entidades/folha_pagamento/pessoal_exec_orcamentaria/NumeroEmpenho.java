
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * numeroEmpenho
 * <p>
 * Informa os dados do empenho e seus desdobramentos.
 * 
 */
@Entity
@Data
public class NumeroEmpenho extends BaseEntityID {

    /**
     * Número do empenho
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroEmpenho;
    /**
     * Valor do empenho
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     * 
     */
    @NotNull
    private String dataEmpenho;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "numero_empenho_id")
    private Set<Liquidacao> liquidacao = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "numero_empenho_id")
    private Set<OrdemDePagamento> ordemDePagamento = new HashSet<>();

}
