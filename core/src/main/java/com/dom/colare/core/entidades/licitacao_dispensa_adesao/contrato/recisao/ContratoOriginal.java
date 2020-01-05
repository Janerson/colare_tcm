
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
 * 
 */
@Entity
@Data
public class ContratoOriginal extends BaseEntityID {

    @OneToOne
    @MapsId
    private ContratoRecisao contratoRecisao;

    /**
     * Ano do contrato
     * (Required)
     * 
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    @Column
    private Integer anoContrato;

    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codNaturezaObjeto;

    /**
     * Tipo do procedimento
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codTipoProcedimento;

    /**
     * Data do fim da vigência
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String fimVigencia;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String idDocumentoPDF;

    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String inicioVigencia;

    /**
     * Número do contrato
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String numeroContrato;

    /**
     * Objeto
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String objeto;

    /**
     * Valor do contrato
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double valorContrato;

    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "contratoOriginal",cascade = CascadeType.ALL)
    private LicitacaoRecisao licitacao;

}
