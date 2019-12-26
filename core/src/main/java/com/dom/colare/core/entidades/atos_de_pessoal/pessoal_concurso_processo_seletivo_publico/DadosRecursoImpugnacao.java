
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dadosRecursoImpugnacao
 * <p>
 * Informa os dados sobre a recurso e impugnação dos atos e fases da seleção.
 * 
 */
public class DadosRecursoImpugnacao {

    /**
     * previsão de prazo para interposição de recursos
     * (Required)
     * 
     */
    @NotNull
    public Boolean haPrazoParaInterposicaoDeRecursos;
    /**
     * Admite recurso por procuração
     * (Required)
     * 
     */
    @NotNull
    public Boolean admiteRecursoPorProcuracao;
    /**
     * Admite recursos por outros meios não presenciais, com internet, fax e etc.
     * (Required)
     * 
     */
    @NotNull
    public Boolean admiteOutrosRecursosNaoPresenciais;
    /**
     * Caso alguma questão seja anulada, serão atribuídos os pontos para todos os participantes.
     * (Required)
     * 
     */
    @NotNull
    public Boolean seraoAtribuidosOsPontosDasQuestoesAnuladasATodos;
    @Valid
    public Set<DetalhamentoPrazoParaInterposicaoDeRecurso> detalhamentoPrazoParaInterposicaoDeRecurso = null;
    @Valid
    public Set<DetalhamentoRecursoPorProcuracao> detalhamentoRecursoPorProcuracao = null;
    @Valid
    public Set<DetalhamentoDeOutrosRecursosNaoPresenciai> detalhamentoDeOutrosRecursosNaoPresenciais = null;
    @Valid
    public Set<DetalhamentoPontosDasQuestoesAnulada> detalhamentoPontosDasQuestoesAnuladas = null;

}
