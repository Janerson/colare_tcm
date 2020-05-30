
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * atasLicitacao
 * <p>
 * Dados da(s) ata(s) da(s) sessão(ões)
 * 
 */
@Entity(name = "ATAS_FASE2")
@Data
public class AtasLicitacao extends BaseEntityID {

    /**
     * Código do tipo de ata.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoAta;
    /**
     * Data do evento
     * (Required)
     * 
     */
    @NotNull
    private String data;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
