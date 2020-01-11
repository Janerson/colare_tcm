
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalExecucaoOrcamentariaFolhaPagamento
 * <p>
 * Contém informações da Execução Orçamentária da Folha de Pagamento.
 * 
 */
@Entity
@Data
public class PessoalExecucaoOrcamentariaFolhaPagamento extends BaseEntityID {

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
     * ID da folha de pagamento previamente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalFolhaDePagamento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "pessoal_exec_id")
    private Set<NumeroEmpenho> numeroEmpenho = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "pessoal_exec_id")
    private Set<Banco> banco = new HashSet<>();


}
