
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * vinculoCargoEspecifico
 * <p>
 * Informa se a verba é vinculada a algum cargo em especifico.
 * 
 */
@Entity
@Data
public class VinculoCargoEspecifico extends BaseEntityID {

    /**
     * Vinculo com Cargo Especifico
     * (Required)
     * 
     */
    @NotNull
    private Boolean haVinculoCargoEspecifico;


    @Valid
    @OneToMany
    @JoinColumn(name = "vinculo_cargo_id")
    private Set<DetalhamentoVinculoCargoEspecifico> detalhamentoVinculoCargoEspecifico = null;

}
