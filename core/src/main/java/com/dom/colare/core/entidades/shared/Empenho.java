package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Data
public abstract class Empenho extends BaseEntityID {

    /**
     * Número do empenho
     * (Required)
     *
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroEmpenho;
    /**
     * Data de emissão do empenho
     * (Required)
     *
     */
    @NotNull
    public String dataEmpenho;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     *
     */
    @NotNull
    public String idDocumentoPDF;
}
