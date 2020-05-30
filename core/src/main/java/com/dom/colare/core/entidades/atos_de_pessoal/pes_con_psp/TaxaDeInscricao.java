
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
 * taxaDeInscricao
 * <p>
 * Informar as detalhamentos sobre a taxa de inscrição na Seleção.
 * 
 */
@Entity(name = "PES_CON_INSCR")
@Data
public class TaxaDeInscricao extends BaseEntityID {

    /**
     * Existe previsão de isenção do pagamento da taxa de inscrição.
     * (Required)
     * 
     */
    @NotNull
    private Boolean existePrevisaoDeIsencao;
    /**
     * Existe previsão de devolução devido pagamento de taxa de inscrição em duplicidade.
     * (Required)
     * 
     */
    @NotNull
    private Boolean existePrevisaoDeDevolucaoDevidoPagEmDuplicidade;
    /**
     * Existe previsão de Devolução da taxa de inscrição devido o cancelamento da Seleção.
     * (Required)
     * 
     */
    @NotNull
    private Boolean existePrevisaoDeDevolucaoTaxaDevidoCancelamento;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_INSCR_ID")
    private Set<DetalhamentoPrevisaoDeIsencao> detalhamentoPrevisaoDeIsencao = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_INSCR_ID")
    private Set<DetalhamentoPrevisaoDeDevolucao> detalhamentoPrevisaoDeDevolucao = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_INSCR_ID")
    private Set<DetalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade> detalhamentoPrevisaoDeDevolucaoPagamentoEmDuplicidade = null;

}
