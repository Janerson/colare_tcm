
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoTipoCalculoCondicional
 * <p>
 * Detalhamento do Tipo Cálculo Condicional
 * 
 */
@Entity(name = "PES_VER_FORMCA2")
@Data
public class DetalhamentoTipoCalculoCondicional extends BaseEntityID {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * Valor Maximo
     * (Required)
     * 
     */
    @NotNull
    private Double vlMaximo;
    /**
     * Valor Minimo
     * (Required)
     * 
     */
    @NotNull
    private Double vlMinimo;


}
