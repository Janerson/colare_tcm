
package com.dom.colare.domain.dto.lic.contrato_ini;


import lombok.Data;

/**
 * procedimentoDeContratacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idProcedimento for igual a "-1", com os dados do Procedimento de contratação (Licitação, Dispensa/Inexigibilidade ou Adesão a Registro de Preços).
 * 
 */
@Data
public class ProcedimentoDeContratacao {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    private Integer idUnidadeGestora;
    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "1-Licitação", com os dados da licitação da qual resultou o contrato.
     * 
     */
    private Licitacao licitacao;
    /**
     * dispensaEInexigibilidade
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "2-Dispensa", com os dados da dispensa/inexigibilidade da qual resultou o contrato.
     * 
     */
    private DispensaEInexigibilidade dispensaEInexigibilidade;
    /**
     * adesaoARegistroDePrecos
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "3-Adesão a registro de preços", com os dados da adesão da qual resultou o contrato.
     * 
     */
    private AdesaoARegistroDePrecos adesaoARegistroDePrecos;

}
