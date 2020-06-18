
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dedicacaoExclusiva
 * <p>
 * Informar se o cargo é de dedicação exclusiva
 * 
 */
@Entity(name = "PES_CARGO_DEDIC")
@Data
public class DedicacaoExclusiva extends BaseEntityID {

    /**
     * Informa se o cargo possui regime de dedicação exclusiva
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoDedicacaoExclusiva;
    /**
     * detalhamentoDedicacaoExclusiva
     * <p>
     * Informar os detalhes da dedicação exclusiva
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_CARGO_DECEX_ID")
    private DetalhamentoDedicacaoExclusiva detalhamentoDedicacaoExclusiva;


}
