
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * folhaDePagamento
 * <p>
 * Relação Folha Pagamento
 * 
 */
public class FolhaDePagamento {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * Informa o número do CPF do Ordenador de Despesa
     * (Required)
     * 
     */
    @NotNull
    public String numeroCPFOrdenadorDespesa;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ServidorEmFolha> servidorEmFolha = null;

}
