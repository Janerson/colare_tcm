
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoVinculoCargoEspecifico
 * <p>
 * Detalhamento Vinculo Cargo Especifico
 * 
 */
public class DetalhamentoVinculoCargoEspecifico {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    public Integer getIdPessoalCargo() {
        return idPessoalCargo;
    }

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    public void setIdPessoalCargo(Integer idPessoalCargo) {
        this.idPessoalCargo = idPessoalCargo;
    }

}
