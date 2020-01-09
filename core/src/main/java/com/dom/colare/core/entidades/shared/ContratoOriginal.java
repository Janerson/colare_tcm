package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Data
public abstract class ContratoOriginal extends BaseEntityID {

    /**
     * Ano do contrato
     * (Required)
     *
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    private Integer anoContrato;

    /**
     * Código da Natureza do Objeto
     * (Required)
     *
     */
    @NotNull
    private Integer codNaturezaObjeto;

    /**
     * Número do contrato
     * (Required)
     *
     */
    @NotNull
    @Column
    private String numeroContrato;

    /**
     * Tipo do procedimento
     * (Required)
     *
     */
    @NotNull
    @Column
    private Integer codTipoProcedimento;

    /**
     * Data do início da vigência
     * (Required)
     *
     */
    @NotNull
    private String inicioVigencia;
    /**
     * Data do fim da vigência
     * (Required)
     *
     */
    @NotNull
    private String fimVigencia;

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
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     *
     */
    @NotNull
    private String idDocumentoPDF;
}
