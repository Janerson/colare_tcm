
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * cargoDeOutroEnte
 * <p>
 * Informar se o cargo pertence a outro ente federado
 * 
 */
@Entity(name = "PES_CARGO_ENTE")
@Data
public class CargoDeOutroEnte extends BaseEntityID {

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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGO_OUTEN_ID")
    private DetalhamentoCargoDeOutroEnte detalhamentoCargoDeOutroEnte;

}
