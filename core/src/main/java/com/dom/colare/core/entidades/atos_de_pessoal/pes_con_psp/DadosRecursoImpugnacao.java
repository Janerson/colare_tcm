
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
 * dadosRecursoImpugnacao
 * <p>
 * Informa os dados sobre a recurso e impugnação dos atos e fases da seleção.
 * 
 */
@Entity(name = "PES_CON_IMPUG")
@Data
public class DadosRecursoImpugnacao extends BaseEntityID {

    /**
     * previsão de prazo para interposição de recursos
     * (Required)
     * 
     */
    @NotNull
    private Boolean haPrazoParaInterposicaoDeRecursos;
    /**
     * Admite recurso por procuração
     * (Required)
     * 
     */
    @NotNull
    private Boolean admiteRecursoPorProcuracao;
    /**
     * Admite recursos por outros meios não presenciais, com internet, fax e etc.
     * (Required)
     * 
     */
    @NotNull
    private Boolean admiteOutrosRecursosNaoPresenciais;
    /**
     * Caso alguma questão seja anulada, serão atribuídos os pontos para todos os participantes.
     * (Required)
     * 
     */
    @NotNull
    private Boolean seraoAtribuidosOsPontosDasQuestoesAnuladasATodos;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_IMPUG_ID")
    private Set<DetalhamentoPrazoParaInterposicaoDeRecurso> detalhamentoPrazoParaInterposicaoDeRecurso = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_IMPUG_ID")
    private Set<DetalhamentoRecursoPorProcuracao> detalhamentoRecursoPorProcuracao = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_IMPUG_ID")
    private Set<DetalhamentoDeOutrosRecursosNaoPresencial> detalhamentoDeOutrosRecursosNaoPresencials = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_IMPUG_ID")
    private Set<DetalhamentoPontosDasQuestoesAnulada> detalhamentoPontosDasQuestoesAnuladas = null;

}
