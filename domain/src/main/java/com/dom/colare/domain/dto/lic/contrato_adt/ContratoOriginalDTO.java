
package com.dom.colare.domain.dto.lic.contrato_adt;

import lombok.Data;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo aditivado.
 * 
 */
@Data
public class ContratoOriginalDTO {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;
    /**
     * Ano do contrato
     * (Required)
     * 
     */
    private Integer anoContrato;
    /**
     * Número do contrato
     * (Required)
     * 
     */
    private String numeroContrato;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    private Long codNaturezaObjeto;
    /**
     * Tipo do procedimento
     * (Required)
     * 
     */
    private Long codTipoProcedimento;
    /**
     * Valor do contrato
     * (Required)
     * 
     */
    private Double valorContrato;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    private String inicioVigencia;
    /**
     * Data do fim da vigência
     * (Required)
     * 
     */
    private String fimVigencia;
    /**
     * Objeto
     * (Required)
     * 
     */
    private String objeto;
    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original e o seu aditivo.
     * 
     */
    private LicitacaoDTO licitacao;


}
