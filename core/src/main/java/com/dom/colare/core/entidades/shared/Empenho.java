package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Empenho extends BaseEntityID {

    /**
     * Número do empenho
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     *
     */
    @NotNull
    private String dataEmpenho;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     *
     */
    @NotNull
    private String idDocumentoPDF;
}
