
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * criteriosDeDesempate
 * <p>
 * Informar os critérios de desempate.
 * 
 */
public class CriteriosDeDesempate {

    /**
     * Idade superior a 60 anos é estabelecido como primeiro critério de desempate.
     * (Required)
     * 
     */
    @NotNull
    public Boolean maiorDe60AnosComoPrimerioCriterio;
    /**
     * Experiência no serviço publico constitui um critério de desempate
     * (Required)
     * 
     */
    @NotNull
    public Boolean experienciaNoServicoPublicoConstituiUmCriterio;
    @Valid
    public Set<DetalhamentoMaiorDe60AnosComoPrimeiroCriterio> detalhamentoMaiorDe60AnosComoPrimeiroCriterio = null;
    @Valid
    public Set<DetalhamentoExperienciaNoServicoPublicoConstituiUmCriterio> detalhamentoExperienciaNoServicoPublicoConstituiUmCriterio = null;

}
