
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrevisaoDeDevolucao
 * <p>
 * Informa o detalhamento da previsão de devolução da taxa de inscrição no caso de cancelamento da Seleção.
 * 
 */
@Entity(name = "PES_CON_INSC3")
@Data
public class DetalhamentoPrevisaoDeDevolucao extends BaseEntityID {

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
