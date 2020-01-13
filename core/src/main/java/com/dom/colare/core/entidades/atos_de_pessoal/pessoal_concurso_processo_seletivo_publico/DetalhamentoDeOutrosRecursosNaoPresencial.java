
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoDeOutrosRecursosNaoPresenciais
 * <p>
 * Informa a previsão e outros recursos não presenciais para interposição de recurso ou impugnação.
 * 
 */
@Entity(name = "PES_CON_IMPUG4")
@Data
public class DetalhamentoDeOutrosRecursosNaoPresencial extends BaseEntityID {

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
