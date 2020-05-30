
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoLeiPcd
 * <p>
 * informar o Detalhamento da Lei que trata de reserva de vagas para PCD.
 * 
 */
@Entity(name = "PES_CON_DETPCD")
@Data
public class DetalhamentoLeiPcd extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;

}
