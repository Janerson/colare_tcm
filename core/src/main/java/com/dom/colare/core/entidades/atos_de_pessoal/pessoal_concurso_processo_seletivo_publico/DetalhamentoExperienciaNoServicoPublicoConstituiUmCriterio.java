
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoExperienciaNoServicoPublicoConstituiUmCriterio
 * <p>
 * Informa se  Experiencia No Serviço Publico Constitui Um Criterio
 * 
 */
public class DetalhamentoExperienciaNoServicoPublicoConstituiUmCriterio {

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
