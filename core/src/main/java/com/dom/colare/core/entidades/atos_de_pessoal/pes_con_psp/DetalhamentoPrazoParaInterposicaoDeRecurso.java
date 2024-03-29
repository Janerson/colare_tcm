
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPrazoParaInterposicaoDeRecurso
 * <p>
 * Informa os dados sobre a previsão prazo para interposição de recurso.
 * 
 */
@Entity(name = "PES_CON_IMPUG2")
@Data
public class DetalhamentoPrazoParaInterposicaoDeRecurso extends BaseEntityID {

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
