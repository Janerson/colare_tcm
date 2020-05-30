
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * validade
 * <p>
 * Informar a dados da validade da Seleção.
 * 
 */
@Entity(name = "PES_CON_VALIDAD")
@Data
public class Validade extends BaseEntityID {

    /**
     * Tipo de validade, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoValidade;
    /**
     * Quantidade prazo validade
     * (Required)
     * 
     */
    @NotNull
    private Integer prazoDeValidade;
    /**
     * É prevista a prorrogação
     * (Required)
     * 
     */
    @NotNull
    private Boolean ehProrrogavel;
    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;


}
