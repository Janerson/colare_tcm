
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.constraints.NotNull;


/**
 * dadosDoCargoTransformado
 * <p>
 * Informar o IDPessoalCargo de todos cargos que por lei foram transformados no atual
 * 
 */
public class DadosDoCargoTransformado {

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
