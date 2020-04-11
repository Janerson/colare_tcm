
package com.dom.colare.domain.dto.licitacao.contrato.recisao;

import lombok.Data;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
 * 
 */
@Data
public class LicitacaoDTO {

    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    private int codModalidadeLicitacao;
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
