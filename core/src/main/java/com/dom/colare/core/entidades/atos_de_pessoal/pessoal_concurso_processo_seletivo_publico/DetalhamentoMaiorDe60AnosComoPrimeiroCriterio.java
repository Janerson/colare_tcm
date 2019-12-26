
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoMaiorDe60AnosComoPrimeiroCriterio
 * <p>
 * Informar se o critério de idade, maior de 60 Anos, como primeiro critério de desempate.
 * 
 */
public class DetalhamentoMaiorDe60AnosComoPrimeiroCriterio {

    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    public String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;

}
