
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoMembrosComissao
 * <p>
 * Informar a composição da Comissão Organizadora da Seleção
 * 
 */
@Entity(name = "PES_CON_MENBROS")
@Data
public class DetalhamentoMembrosComissao extends BaseEntityID {

    /**
     * Tipo de função exercida na Comissão Organizadora da Seleção, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoDeFuncaoComissaoOrganizadora;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    private String numeroCpf;

   
}
