
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

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
@Entity(name = "PES_CON_DESMP1")
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
