
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.regulamentacao_procedimentos_licitatorio;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoLc123
 * <p>
 * Detalhamento da regulamentação do Artigo 47 da Lei Complementar 123/06
 * 
 */
public class DetalhamentoLc123 {

    /**
     * Identifica se o município regulamentou procedimentos para participação exclusiva de ME e EPP
     * (Required)
     * 
     */
    @NotNull
    public Boolean regulamentouParticipExclusivaMEEPP;
    /**
     * Artigo que regulamenta a participação exclusiva de ME e EPP
     * 
     */
    public String artigoRegulamentouParticipExclusivaMEEPP;
    /**
     * Valor Limite da regulamentação da participação exclusiva de ME e EPP.
     * 
     */
    @DecimalMin("0")
    public Double valorLimiteRegParticipExclusivaMEEPP;
    /**
     * Identifica se o município estabeleceu procedimentos para a subcontratação de ME e EPP
     * (Required)
     * 
     */
    @NotNull
    public Boolean regulamentouProcSubContratacaoMEEPP;
    /**
     * Artigo dos procedimentos de subcontratação de ME e EPP
     * 
     */
    public String artigoProcSubContratacaoMEEPP;
    /**
     * Percentual estabelecido para subcontratação de ME e EPP
     * 
     */
    @DecimalMin("0")
    @DecimalMax("100")
    public Double percentualSubContratacaoMEEPP;
    /**
     * Identifica se o município estabeleceu critérios para empenho e pagamento a ME e EPP
     * (Required)
     * 
     */
    @NotNull
    public Boolean regulamentouCriteriosEmpenhoPagamentoMEEPP;
    /**
     * Artigo relativo aos critérios para empenho e pagamento a ME e EPP
     * 
     */
    public String artigoEmpenhoPagamentoMEEPP;
    /**
     * Identifica se o município estabeleceu reserva de percentual do objeto para a contratação de ME e EPP
     * (Required)
     * 
     */
    @NotNull
    public Boolean regulamentouPercObjetoContratacaoMEEPP;
    /**
     * Artigo do percentual do objeto para contratação de ME e EPP
     * 
     */
    public String artigoPercObjetoContratacaoMEEPP;
    /**
     * Percentual do objeto estabelecido para contratação de ME e EPP
     * 
     */
    @DecimalMin("0")
    @DecimalMax("100")
    public Double percentualObjetoContratacaoMEEPP;

}
