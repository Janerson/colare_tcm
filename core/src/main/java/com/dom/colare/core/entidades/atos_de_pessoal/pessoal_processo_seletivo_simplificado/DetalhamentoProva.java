
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoProva
 * <p>
 * Informa o Detalhamento da Prova
 * 
 */
@Entity
@Data
public class DetalhamentoProva extends BaseEntityID {

    /**
     * Tipo de prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoProva;
    /**
     * Caráter da prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoCaraterProva;
    /**
     * Data da realização da prova
     * (Required)
     * 
     */
    @NotNull
    private String dataRealizacaoProva;

}
