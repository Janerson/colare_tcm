
package com.dom.colare.domain.dto.licitacao.contrato.recisao;

import lombok.Data;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
 * 
 */
@Data
public class ContratoOriginalDTO {

    /**
     * Ano do contrato
     * (Required)
     * 
     */
    private Integer anoContrato;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    private int codNaturezaObjeto;
    /**
     * Tipo do procedimento
     * (Required)
     * 
     */
    private int codTipoProcedimento;
    /**
     * Data do fim da vigência
     * (Required)
     * 
     */
    private String fimVigencia;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    private String inicioVigencia;
    /**
     * Número do contrato
     * (Required)
     * 
     */
    private String numeroContrato;
    /**
     * Objeto
     * (Required)
     * 
     */
    private String objeto;
    /**
     * Valor do contrato
     * (Required)
     * 
     */
    private Double valorContrato;
    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
     * 
     */
    private LicitacaoDTO licitacao;



}
