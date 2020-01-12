
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoMaiorDe60AnosComoPrimeiroCriterio
 * <p>
 * Informar se o critério de idade, maior de 60 Anos, como primeiro critério de desempate.
 * 
 */
@Entity
@Data
public class DetalhamentoMaiorDe60AnosComoPrimeiroCriterio extends BaseEntityID {

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
