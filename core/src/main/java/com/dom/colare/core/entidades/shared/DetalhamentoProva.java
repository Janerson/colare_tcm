
package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoProva
 * <p>
 * Informar o detalhamento das provas vinculadas ao cargos da seleção.
 * 
 */
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DetalhamentoProva extends BaseEntityID {

    /**
     * Data da realização da prova
     * (Required)
     * 
     */
    @NotNull
    private String dataRealizacaoProva;
    /**
     * Tipo de prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoProva;
    /**
     * caraterdaprova
     * <p>
     * Informar detalhes sobre o caráter da prova e clausulas sobre pontuação da prova. 
     * (Required)
     * 
     */


}
