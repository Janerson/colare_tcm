
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import javax.validation.constraints.NotNull;


/**
 * textoDoEdital
 * <p>
 * Contem os documentos relativos ao corpo do Edital e seus Anexos
 * 
 */
public class TextoDoEdital {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    public Integer codTipoDocumento;
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
