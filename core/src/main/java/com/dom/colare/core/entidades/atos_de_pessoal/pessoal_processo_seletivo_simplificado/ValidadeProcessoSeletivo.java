
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * validadeProcessoSeletivo
 * <p>
 * Informa Validade Processo Seletivo
 * 
 */
@Entity(name = "PES_PSS_VALID")
@Data
public class ValidadeProcessoSeletivo extends BaseEntityID {

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
