
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * normaOuLegislacaoRegulamentada
 * <p>
 * Lista de Normas que a presente Norma regulamenta
 * 
 */
@Entity(name = "PES_NOR_REG")
@Data
public class NormaOuLegislacaoRegulamentada extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;


}
