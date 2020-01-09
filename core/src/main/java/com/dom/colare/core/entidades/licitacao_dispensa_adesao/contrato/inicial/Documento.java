
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


/**
 * documentos
 * <p>
 * Documentos relacionados à adesão
 * 
 */
@Entity
@Data
public class Documento extends BaseEntityID {

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

    @ManyToOne
    private AdesaoARegistroDePrecosAte2018 adesaoARegistroDePrecos;


}
