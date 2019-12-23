
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import javax.validation.constraints.NotNull;


/**
 * remuneracaoOuDescontoDoServidor
 * <p>
 * Contem as informações referentes às Remunerações e Descontos do Servidor, exceto descontos Previdenciários (RPPS ou RGPS) e Tributário (IRRF)
 * 
 */
public class RemuneracaoOuDescontoDoServidor {

    /**
     * Informa o ID de uma entrega do Layout de Pessoal Concessão Vantagem Desconto
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalConcessaoVantagemDesconto;
    /**
     * Código da fonte de recursos
     * (Required)
     * 
     */
    @NotNull
    public Integer codFonteRecursos;

}
