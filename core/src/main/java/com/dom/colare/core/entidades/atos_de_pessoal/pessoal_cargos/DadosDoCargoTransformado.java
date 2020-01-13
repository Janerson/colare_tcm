
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * dadosDoCargoTransformado
 * <p>
 * Informar o IDPessoalCargo de todos cargos que por lei foram transformados no atual
 * 
 */
@Entity(name = "PES_CARGO_TRNSF")
@Data
public class DadosDoCargoTransformado extends BaseEntityID {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;

}
