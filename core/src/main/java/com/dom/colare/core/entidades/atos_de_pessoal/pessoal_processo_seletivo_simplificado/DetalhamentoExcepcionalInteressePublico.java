
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import javax.validation.constraints.NotNull;


/**
 * detalhamentoExcepcionalInteressePublico
 * <p>
 * Informar os detalhes do excepcional interesse público para a realização do Processo Seletivo Simplificado.
 * 
 */
public class DetalhamentoExcepcionalInteressePublico {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalLegislacao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;

}
