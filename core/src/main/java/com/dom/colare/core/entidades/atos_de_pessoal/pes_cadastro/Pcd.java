
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cadastro;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pcd
 * <p>
 * Informar detalhes Pessoa com Deficiência
 * 
 */
@Entity(name = "PES_CAD_PCD")
@Data
public class Pcd extends BaseEntityID {

    /**
     * Pessoa com Deficiencia
     * (Required)
     * 
     */
    @NotNull
    private Boolean pcD;
    /**
     * detalhamentoDeficiencia
     * <p>
     * Informa o detalhamento da deficiência.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_CAD_DET_PCD_ID")
    private DetalhamentoDeficiencia detalhamentoDeficiencia;

}
