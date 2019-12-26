
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * cargoDeOutroEnte
 * <p>
 * Informar se o cargo pertence a outro ente federado
 * 
 */
public class CargoDeOutroEnte {

    /**
     * Informa se o cargo pertence a outro Ente Federado
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoDeOutroEnte;
    /**
     * detalhamentoCargoDeOutroEnte
     * <p>
     * Informa o detalhamento do ente de origem do cargo
     * 
     */
    @Valid
    private DetalhamentoCargoDeOutroEnte detalhamentoCargoDeOutroEnte;

    /**
     * Informa se o cargo pertence a outro Ente Federado
     * (Required)
     * 
     */
    public Boolean getCargoDeOutroEnte() {
        return cargoDeOutroEnte;
    }

    /**
     * Informa se o cargo pertence a outro Ente Federado
     * (Required)
     * 
     */
    public void setCargoDeOutroEnte(Boolean cargoDeOutroEnte) {
        this.cargoDeOutroEnte = cargoDeOutroEnte;
    }

    /**
     * detalhamentoCargoDeOutroEnte
     * <p>
     * Informa o detalhamento do ente de origem do cargo
     * 
     */
    public DetalhamentoCargoDeOutroEnte getDetalhamentoCargoDeOutroEnte() {
        return detalhamentoCargoDeOutroEnte;
    }

    /**
     * detalhamentoCargoDeOutroEnte
     * <p>
     * Informa o detalhamento do ente de origem do cargo
     * 
     */
    public void setDetalhamentoCargoDeOutroEnte(DetalhamentoCargoDeOutroEnte detalhamentoCargoDeOutroEnte) {
        this.detalhamentoCargoDeOutroEnte = detalhamentoCargoDeOutroEnte;
    }

}
