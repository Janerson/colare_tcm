
package com.dom.colare.domain.dto.lic.contrato_adt;

import lombok.Data;

/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original e o seu aditivo.
 * 
 */
@Data
public class LicitacaoDTO {

    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    private Long codModalidadeLicitacao;
    /**
     * Exercício do edital da licitação
     * (Required)
     * 
     */
    private Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     * 
     */
    private Integer numeroLicitacao;


}
