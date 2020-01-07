package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
public abstract class Documento extends BaseEntityID {

    /**
     * Tipo do documento anexado relacionado à adesão
     * (Required)
     *
     */
    @NotNull
    public Integer codTipoDocumentoAnexadoAdesao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     *
     */
    @NotNull
    public String idDocumentoPDF;
}
