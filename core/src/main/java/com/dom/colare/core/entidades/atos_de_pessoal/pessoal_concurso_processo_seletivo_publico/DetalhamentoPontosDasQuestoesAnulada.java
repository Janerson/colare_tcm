
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoPontosDasQuestoesAnuladas
 * <p>
 * Informa a previsão de, no caso de anulação de alguma questão, atribuir-se pontuação a todos candidatos.
 * 
 */
@Entity(name = "PES_CON_IMPUG5")
@Data
public class DetalhamentoPontosDasQuestoesAnulada extends BaseEntityID {

    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;

}
