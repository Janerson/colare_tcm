
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cadastro;

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
@Entity
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
    @JoinColumn(name = "pcd_id")
    private DetalhamentoDeficiencia detalhamentoDeficiencia;

}
