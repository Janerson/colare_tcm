
package com.dom.colare.core.entidades.atos_de_pessoal.pes_verbas;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * formaDeCalculo
 * <p>
 * Informar a Forma De Calculo
 * 
 */
@Entity(name = "PES_VER_FORMCAL")
@Data
public class FormaDeCalculo extends BaseEntityID {

    /**
     * Tipo de Calculo
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoCalculo;
    /**
     * Valor ou Percentual
     * (Required)
     * 
     */
    @NotNull
    private Double valorOuPercentual;
    /**
     * Tipo de Base de Calculo
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer tipoBaseDeCalculo;
    /**
     * Detalhe Base de Calculo
     * (Required)
     * 
     */
    @NotNull
    private Double baseDeCalculoDetalhe;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_VER_FORMCAL_ID")
    private Set<DetalhamentoTipoCalculoCondicional> detalhamentoTipoCalculoCondicional = null;


}
