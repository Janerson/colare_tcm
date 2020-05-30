
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cadastro;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoDeficiencia
 * <p>
 * Informa o detalhamento da deficiência.
 * 
 */
@Entity(name = "PES_CAD_DET_PCD")
@Data
public class DetalhamentoDeficiencia extends BaseEntityID {

    /**
     * CID PcD
     * (Required)
     * 
     */
    @NotNull
    private String cIDPcD;
    /**
     * Tipo de Deficiencia
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoDeficiencia;


}
