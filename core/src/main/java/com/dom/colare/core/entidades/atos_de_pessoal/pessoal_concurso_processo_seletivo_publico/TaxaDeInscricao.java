
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * taxaDeInscricao
 * <p>
 * Informar as detalhamentos sobre a taxa de inscrição na Seleção.
 * 
 */
public class TaxaDeInscricao {

    /**
     * Existe previsão de isenção do pagamento da taxa de inscrição.
     * (Required)
     * 
     */
    @NotNull
    public Boolean existePrevisaoDeIsencao;
    /**
     * Existe previsão de devolução devido pagamento de taxa de inscrição em duplicidade.
     * (Required)
     * 
     */
    @NotNull
    public Boolean existePrevisaoDeDevolucaoDevidoPagEmDuplicidade;
    /**
     * Existe previsão de Devolução da taxa de inscrição devido o cancelamento da Seleção.
     * (Required)
     * 
     */
    @NotNull
    public Boolean existePrevisaoDeDevolucaoTaxaDevidoCancelamento;
    @Valid
    public Set<DetalhamentoPrevisaoDeIsencao> detalhamentoPrevisaoDeIsencao = null;
    @Valid
    public Set<DetalhamentoPrevisaoDeDevolucao> detalhamentoPrevisaoDeDevolucao = null;
    @Valid
    public Set<DetalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade> detalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade = null;

}
