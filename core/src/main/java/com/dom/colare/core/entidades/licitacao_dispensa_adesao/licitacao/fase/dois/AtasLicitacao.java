
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

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
@Entity
@Data
public class AtasLicitacao extends BaseEntityID {

    /**
     * Código do tipo de ata.
     * (Required)
     * 
     */
    @NotNull
    public Integer codTipoAta;
    /**
     * Data do evento
     * (Required)
     * 
     */
    @NotNull
    public String data;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

}
