
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoExtincao
 * <p>
 * Informar o detalhamento da extinção do cargo
 * 
 */
@Entity(name = "PES_CARGO_EXTF")
@Data
public class DetalhamentoExtincao extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    @NotNull
    private String artigo;
    /**
     * Data de início da extinção cargo quando vagar
     * (Required)
     * 
     */
    @NotNull
    private String dataInicioEmExtincao;

}
