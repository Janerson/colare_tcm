package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * solicitacaoConcurso
 * <p>
 * Informar a Solicitação Concurso, conforme Art. 7º, parágrafo único, I, a, da IN 10/15.
 * 
 */
@Entity(name = "PES_CON_SOLCON")
@Data
public class SolicitacaoConcurso extends BaseEntityID {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

}
