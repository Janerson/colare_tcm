
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * descontoIrrf
 * <p>
 * Contém as informações referente ao desconto de IRRF, quando este ocorrer.
 * 
 */
public class DescontoIrrf {

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
    /**
     * Informa valor da Verba (Remuneração ou Desconto)
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valor;

}
