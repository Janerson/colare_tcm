
package com.dom.colare.core.entidades.folha_pagamento.pessoal_exec_orcamentaria;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * remessaBancaria
 * <p>
 * Contém o arquivo de Remessa Bancária
 * 
 */
@Entity
@Data
public class RemessaBancaria extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String docArquivoRemessa;

}
