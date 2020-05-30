
package com.dom.colare.core.entidades.lic.contrato_resc;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
 * 
 */
@Entity(name = "RESC_CONTR_ORIG")
@Data
public class ContratoOriginalRecisao extends BaseEntityID {

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
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RESC_CONT_LICIT_ID")
    private LicitacaoRecisao licitacao;

}
