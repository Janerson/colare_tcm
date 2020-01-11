
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

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
 * banco
 * <p>
 * Informa os dados do Banco oficial utilizado pela unidade gestora.
 * 
 */
@Entity
@Data
public class Banco extends BaseEntityID {

    /**
     * Informa o código do banco (conforme FEBRABAN e BACEN).
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("999")
    @NotNull
    public Integer codigoBancoOficialPagamentos;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "banco_id")
    public Set<RemessaBancaria> remessaBancaria = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "banco_id")
    public Set<RetornoBancario> retornoBancario = new HashSet<>();

}
