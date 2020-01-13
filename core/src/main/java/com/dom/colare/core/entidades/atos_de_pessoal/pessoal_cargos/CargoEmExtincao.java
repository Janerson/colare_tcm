
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * cargoEmExtincao
 * <p>
 * Informar se o cargo será extinto quando entrar em vacância.
 * 
 */
@Entity(name = "PES_CARGO_EXTIN")
@Data
public class CargoEmExtincao extends BaseEntityID {

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
    @OneToOne
    @JoinColumn(name = "PES_CARGO_EXTF_ID")
    private DetalhamentoExtincao detalhamentoExtincao;


}
