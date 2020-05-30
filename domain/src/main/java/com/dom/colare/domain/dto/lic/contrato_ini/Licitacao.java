
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

import java.util.Set;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "1-Licitação", com os dados da licitação da qual resultou o contrato.
 * 
 */
@Data
public class Licitacao {

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
    /**
     * 
     * (Required)
     * 
     */
    private Set<EditalEAnexo> editalEAnexos = null;

}
