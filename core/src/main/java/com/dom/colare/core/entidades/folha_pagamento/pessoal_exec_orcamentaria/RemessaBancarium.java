
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import javax.validation.constraints.NotNull;


/**
 * remessaBancaria
 * <p>
 * Contém o arquivo de Remessa Bancária
 * 
 */
public class RemessaBancarium {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String docArquivoRemessa;

}
