
package com.dom.colare.core.entidades.folha_pagamento.pes_fp_exc_orcm;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * ordemDePagamento
 * <p>
 * Contm as informações sobre as Ordens de Pagamento
 * 
 */
@Entity(name = "PES_FP_EXEC_OP")
@Data
public class OrdemDePagamento extends BaseEntityID {

    /**
     * Número da Ordem de Pagamento
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroOP;
    /**
     * Data do pagamento
     * (Required)
     * 
     */
    @NotNull
    private String dataPagamento;
    /**
     * Informa o valor do pagamento
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorPagamento;

}
