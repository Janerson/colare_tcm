
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoProva
 * <p>
 * Informar o detalhamento das provas vinculadas ao cargos da seleção.
 * 
 */
@Entity
@Data
public class DetalhamentoProva extends BaseEntityID {

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
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "detalhamento_prova_id")
    private Caraterdaprova caraterdaprova;

}
