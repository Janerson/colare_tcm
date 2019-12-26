
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * solicitacaoConcurso
 * <p>
 * Informar a Solicitação Concurso, conforme Art. 7º, parágrafo único, I, a, da IN 10/15.
 * 
 */
public class SolicitacaoConcurso {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

}
