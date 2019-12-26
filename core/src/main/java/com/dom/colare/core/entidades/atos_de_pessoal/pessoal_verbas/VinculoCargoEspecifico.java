
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * vinculoCargoEspecifico
 * <p>
 * Informa se a verba é vinculada a algum cargo em especifico.
 * 
 */
public class VinculoCargoEspecifico {

    /**
     * Vinculo com Cargo Especifico
     * (Required)
     * 
     */
    @NotNull
    private Boolean haVinculoCargoEspecifico;
    @Valid
    private Set<DetalhamentoVinculoCargoEspecifico> detalhamentoVinculoCargoEspecifico = null;

    /**
     * Vinculo com Cargo Especifico
     * (Required)
     * 
     */
    public Boolean getHaVinculoCargoEspecifico() {
        return haVinculoCargoEspecifico;
    }

    /**
     * Vinculo com Cargo Especifico
     * (Required)
     * 
     */
    public void setHaVinculoCargoEspecifico(Boolean haVinculoCargoEspecifico) {
        this.haVinculoCargoEspecifico = haVinculoCargoEspecifico;
    }

    public Set<DetalhamentoVinculoCargoEspecifico> getDetalhamentoVinculoCargoEspecifico() {
        return detalhamentoVinculoCargoEspecifico;
    }

    public void setDetalhamentoVinculoCargoEspecifico(Set<DetalhamentoVinculoCargoEspecifico> detalhamentoVinculoCargoEspecifico) {
        this.detalhamentoVinculoCargoEspecifico = detalhamentoVinculoCargoEspecifico;
    }

}
