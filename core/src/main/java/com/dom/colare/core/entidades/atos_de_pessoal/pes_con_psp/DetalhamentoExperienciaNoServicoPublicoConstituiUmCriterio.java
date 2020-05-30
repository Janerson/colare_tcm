
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoExperienciaNoServicoPublicoConstituiUmCriterio
 * <p>
 * Informa se  Experiencia No Serviço Publico Constitui Um Criterio
 * 
 */
@Entity(name = "PES_CON_DESEMP3")
@Data
public class DetalhamentoExperienciaNoServicoPublicoConstituiUmCriterio extends BaseEntityID {

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
