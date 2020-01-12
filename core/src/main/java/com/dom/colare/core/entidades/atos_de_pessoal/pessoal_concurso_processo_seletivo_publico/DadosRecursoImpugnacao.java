
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

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
@Entity
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
    @JoinColumn(name = "recurso_inpugnacao_id")
    private Set<DetalhamentoPrazoParaInterposicaoDeRecurso> detalhamentoPrazoParaInterposicaoDeRecurso = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "recurso_inpugnacao_id")
    private Set<DetalhamentoRecursoPorProcuracao> detalhamentoRecursoPorProcuracao = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "recurso_inpugnacao_id")
    private Set<DetalhamentoDeOutrosRecursosNaoPresencial> detalhamentoDeOutrosRecursosNaoPresencials = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "recurso_inpugnacao_id")
    private Set<DetalhamentoPontosDasQuestoesAnulada> detalhamentoPontosDasQuestoesAnuladas = null;

}
