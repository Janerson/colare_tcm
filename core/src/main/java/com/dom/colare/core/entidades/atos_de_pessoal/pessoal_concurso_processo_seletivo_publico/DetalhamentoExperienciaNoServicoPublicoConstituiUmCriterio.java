
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

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
@Entity
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
