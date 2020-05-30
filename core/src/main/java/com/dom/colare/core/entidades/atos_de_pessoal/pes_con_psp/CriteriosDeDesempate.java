package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * criteriosDeDesempate
 * <p>
 * Informar os critérios de desempate.
 */
@Entity(name = "PES_CON_DESEMPA")
@Data
public class CriteriosDeDesempate extends BaseEntityID {

    /**
     * Idade superior a 60 anos é estabelecido como primeiro critério de desempate.
     * (Required)
     */
    @NotNull
    private Boolean maiorDe60AnosComoPrimerioCriterio;
    /**
     * Experiência no serviço publico constitui um critério de desempate
     * (Required)
     */
    @NotNull
    private Boolean experienciaNoServicoPublicoConstituiUmCriterio;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_DESEMPA_ID")
    private Set<DetalhamentoMaiorDe60AnosComoPrimeiroCriterio> detalhamentoMaiorDe60AnosComoPrimeiroCriterio = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_DESEMPA_ID")
    private Set<DetalhamentoExperienciaNoServicoPublicoConstituiUmCriterio> detalhamentoExperienciaNoServicoPublicoConstituiUmCriterio = null;

}
