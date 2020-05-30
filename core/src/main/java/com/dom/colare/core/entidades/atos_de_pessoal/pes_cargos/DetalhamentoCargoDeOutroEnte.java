
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoCargoDeOutroEnte
 * <p>
 * Informa o detalhamento do ente de origem do cargo
 * 
 */
@Entity(name = "PES_CARGO_OUTEN")
@Data
public class DetalhamentoCargoDeOutroEnte extends BaseEntityID {

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnte;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * Nome da Unidade Gestora de origem ao qual o cargo esta vinculado
     * (Required)
     * 
     */
    @NotNull
    private String unidadeGestoraOrigemCargo;


}
