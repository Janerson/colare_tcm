
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * assuntosDaNorma
 * <p>
 * Informar todos os assuntos presentes na norma
 * 
 */
@Entity(name = "PES_ASSUNTONORM")
@Data
public class AssuntosDaNorma extends BaseEntityID {

    /**
     * Assunto da Norma
     * (Required)
     * 
     */
    @NotNull
    private Integer codAssuntoNorma;

}
