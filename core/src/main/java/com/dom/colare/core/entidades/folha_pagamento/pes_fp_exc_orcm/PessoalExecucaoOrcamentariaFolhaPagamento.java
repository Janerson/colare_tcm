
package com.dom.colare.core.entidades.folha_pagamento.pes_fp_exc_orcm;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
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
@Entity(name = "PES_FP_EXC_ORCM")
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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_FP_EXC_ORCM_ID")
    private Set<NumeroEmpenho> numeroEmpenho = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_FP_EXC_ORCM_ID")
    private Set<Banco> banco = new HashSet<>();


}
