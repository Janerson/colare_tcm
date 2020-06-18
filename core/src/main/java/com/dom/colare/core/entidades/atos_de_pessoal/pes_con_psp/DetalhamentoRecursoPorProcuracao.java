
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoRecursoPorProcuracao
 * <p>
 * Informa dados sobre a previsão de recurso ou impugnação por procuração
 * 
 */
@Entity(name = "PES_CON_IMPUG3")
@Data
public class DetalhamentoRecursoPorProcuracao extends BaseEntityID {

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
