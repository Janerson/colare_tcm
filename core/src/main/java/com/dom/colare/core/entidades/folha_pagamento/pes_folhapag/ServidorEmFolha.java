
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
 * servidorEmFolha
 * <p>
 * Informa os servidores que estão em folha e suas verbas (remuneratórias ou descontos)
 * 
 */
@Entity(name = "PES_FOLPAG_SERV")
@Data
public class ServidorEmFolha extends BaseEntityID {

    /**
     * Informa o tipo  da Situação Funcional que o servidor encontra-se (Ativo ou Inativo), conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoSituacaoFuncional;
    /**
     * Informa o ID do formulario correspondente (Pessoal Admissão, Aposentadoria ou Pensão) ao informado na tabela de Situação Funcional.
     * (Required)
     * 
     */
    @NotNull
    private Integer idSituacaoFuncionalCorrespondente;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_FOLPAG_SERV_ID")
    private Set<RemuneracaoOuDescontoDoServidor> remuneracaoOuDescontoDoServidor = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_FOLPAG_SERV_ID")
    private Set<DescontoPrevidenciario> descontoPrevidenciario = new HashSet<>();


    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_FOLPAG_SERV_ID")
    private Set<DescontoIrrf> descontoIrrf = null;

}
