
package com.dom.colare.core.entidades.atos_de_pessoal.pes_procselsimp;

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
@Entity(name = "PES_PSS_FUNPROV")
@Data
public class DetalhamentoProvaSeletivoSimplificado extends BaseEntityID {


    /**
     * Caráter da prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoCaraterProva;


}
