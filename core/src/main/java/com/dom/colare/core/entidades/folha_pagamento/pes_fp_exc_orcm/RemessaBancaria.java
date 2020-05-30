
package com.dom.colare.core.entidades.folha_pagamento.pes_fp_exc_orcm;

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
@Entity(name = "PES_FP_EXC_RMS")
@Data
public class RemessaBancaria extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String docArquivoRemessa;

}
