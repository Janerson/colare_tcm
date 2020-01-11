
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
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
@Entity
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
    private Set<ServidorEmFolha> servidorEmFolha = new HashSet<>();

}
