
package com.dom.colare.domain.dto.lic.reg_licitacao;


import lombok.Data;

/**
 * detalhamentoLc123
 * <p>
 * Detalhamento da regulamentação do Artigo 47 da Lei Complementar 123/06
 * 
 */
@Data
public class DetalhamentoLc123DTO {

    /**
     * Identifica se o município regulamentou procedimentos para participação exclusiva de ME e EPP
     * (Required)
     * 
     */
    private Boolean regulamentouParticipExclusivaMEEPP;
    /**
     * Artigo que regulamenta a participação exclusiva de ME e EPP
     * 
     */
    private String artigoRegulamentouParticipExclusivaMEEPP;
    /**
     * Valor Limite da regulamentação da participação exclusiva de ME e EPP.
     * 
     */
    private Double valorLimiteRegParticipExclusivaMEEPP;
    /**
     * Identifica se o município estabeleceu procedimentos para a subcontratação de ME e EPP
     * (Required)
     * 
     */
    private Boolean regulamentouProcSubContratacaoMEEPP;
    /**
     * Artigo dos procedimentos de subcontratação de ME e EPP
     * 
     */
    private String artigoProcSubContratacaoMEEPP;
    /**
     * Percentual estabelecido para subcontratação de ME e EPP
     * 
     */
    private Double percentualSubContratacaoMEEPP;
    /**
     * Identifica se o município estabeleceu critérios para empenho e pagamento a ME e EPP
     * (Required)
     * 
     */
    private Boolean regulamentouCriteriosEmpenhoPagamentoMEEPP;
    /**
     * Artigo relativo aos critérios para empenho e pagamento a ME e EPP
     * 
     */
    private String artigoEmpenhoPagamentoMEEPP;
    /**
     * Identifica se o município estabeleceu reserva de percentual do objeto para a contratação de ME e EPP
     * (Required)
     * 
     */
    private Boolean regulamentouPercObjetoContratacaoMEEPP;
    /**
     * Artigo do percentual do objeto para contratação de ME e EPP
     * 
     */
    private String artigoPercObjetoContratacaoMEEPP;
    /**
     * Percentual do objeto estabelecido para contratação de ME e EPP
     * 
     */
    private Double percentualObjetoContratacaoMEEPP;

}
