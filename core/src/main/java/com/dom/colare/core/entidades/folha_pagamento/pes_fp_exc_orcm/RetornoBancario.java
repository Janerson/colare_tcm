
package com.dom.colare.core.entidades.folha_pagamento.pes_fp_exc_orcm;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * retornoBancario
 * <p>
 * Contém o arquivo de retorno bancário
 * 
 */
@Entity(name = "PES_FP_EXC_RETN")
@Data
public class RetornoBancario extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String docArquivoRetorno;

}
