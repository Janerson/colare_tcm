
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoExcepcionalInteresseprivateo
 * <p>
 * Informar os detalhes do excepcional interesse público para a realização do Processo Seletivo Simplificado.
 * 
 */
@Entity(name = "PES_PSS_EXCEP")
@Data
public class DetalhamentoExcepcionalInteressePublico extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;

}
