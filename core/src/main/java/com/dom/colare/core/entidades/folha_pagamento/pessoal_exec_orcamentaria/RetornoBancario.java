
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import javax.validation.constraints.NotNull;


/**
 * retornoBancario
 * <p>
 * Contém o arquivo de retorno bancário
 * 
 */
public class RetornoBancario {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String docArquivoRetorno;

}
