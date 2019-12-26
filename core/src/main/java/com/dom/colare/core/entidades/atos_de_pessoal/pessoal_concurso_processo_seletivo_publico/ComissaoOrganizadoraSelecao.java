
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * comissaoOrganizadoraSelecao
 * <p>
 * Comissão Organizadora da Seleção
 * 
 */
public class ComissaoOrganizadoraSelecao {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoMembrosComissao> detalhamentoMembrosComissao = null;

}
