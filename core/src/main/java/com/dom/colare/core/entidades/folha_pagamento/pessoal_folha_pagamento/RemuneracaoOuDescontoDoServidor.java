
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * remuneracaoOuDescontoDoServidor
 * <p>
 * Contem as informações referentes às Remunerações e Descontos do Servidor, exceto descontos Previdenciários (RPPS ou RGPS) e Tributário (IRRF)
 * 
 */
@Entity(name = "PES_FP_REMDES")
@Data
public class RemuneracaoOuDescontoDoServidor extends BaseEntityID {

    /**
     * Informa o ID de uma entrega do Layout de Pessoal Concessão Vantagem Desconto
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalConcessaoVantagemDesconto;
    /**
     * Código da fonte de recursos
     * (Required)
     * 
     */
    @NotNull
    private Integer codFonteRecursos;

}
