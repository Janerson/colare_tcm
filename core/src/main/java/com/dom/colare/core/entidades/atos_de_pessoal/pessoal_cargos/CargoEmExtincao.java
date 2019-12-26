
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * cargoEmExtincao
 * <p>
 * Informar se o cargo será extinto quando entrar em vacância.
 * 
 */
public class CargoEmExtincao {

    /**
     * Informa se o cargo está em extinção
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoEmExtincao;
    /**
     * detalhamentoExtincao
     * <p>
     * Informar o detalhamento da extinção do cargo
     * 
     */
    @Valid
    private DetalhamentoExtincao detalhamentoExtincao;

    /**
     * Informa se o cargo está em extinção
     * (Required)
     * 
     */
    public Boolean getCargoEmExtincao() {
        return cargoEmExtincao;
    }

    /**
     * Informa se o cargo está em extinção
     * (Required)
     * 
     */
    public void setCargoEmExtincao(Boolean cargoEmExtincao) {
        this.cargoEmExtincao = cargoEmExtincao;
    }

    /**
     * detalhamentoExtincao
     * <p>
     * Informar o detalhamento da extinção do cargo
     * 
     */
    public DetalhamentoExtincao getDetalhamentoExtincao() {
        return detalhamentoExtincao;
    }

    /**
     * detalhamentoExtincao
     * <p>
     * Informar o detalhamento da extinção do cargo
     * 
     */
    public void setDetalhamentoExtincao(DetalhamentoExtincao detalhamentoExtincao) {
        this.detalhamentoExtincao = detalhamentoExtincao;
    }

}
