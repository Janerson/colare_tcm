
package com.dom.colare.core.entidades.folha_pagamento.pes_folhapag;

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
 * folhaDePagamento
 * <p>
 * Relação Folha Pagamento
 * 
 */
@Entity(name = "PES_FOLHAPAG_FP")
@Data
public class FolhaDePagamento extends BaseEntityID {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * Informa o número do CPF do Ordenador de Despesa
     * (Required)
     * 
     */
    @NotNull
    private String numeroCPFOrdenadorDespesa;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_FOLHAPAG_FP_ID")
    private Set<ServidorEmFolha> servidorEmFolha = new HashSet<>();

}
