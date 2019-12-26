
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoLeiPcd
 * <p>
 * informar o Detalhamento da Lei que trata de reserva de vagas para PCD.
 * 
 */
public class DetalhamentoLeiPcd {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalLegislacao;

}
