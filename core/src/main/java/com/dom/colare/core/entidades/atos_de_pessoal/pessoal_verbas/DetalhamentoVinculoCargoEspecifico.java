
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoVinculoCargoEspecifico
 * <p>
 * Detalhamento Vinculo Cargo Especifico
 * 
 */
@Entity
@Data
public class DetalhamentoVinculoCargoEspecifico extends BaseEntityID {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;


}
