
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * autorizacaoLdo
 * <p>
 * Informa dados da autorização na LDO para realização da Seleção.
 * 
 */
public class AutorizacaoLdo {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalLegislacao;
    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    @NotNull
    public String artigo;

}
