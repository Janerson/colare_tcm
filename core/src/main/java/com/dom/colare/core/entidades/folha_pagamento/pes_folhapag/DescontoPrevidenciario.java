
package com.dom.colare.core.entidades.folha_pagamento.pes_folhapag;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * descontoPrevidenciario
 * <p>
 * Contém as informações referente ao desconto Previdênciario
 * 
 */
@Entity(name = "PES_FP_DESCPREV")
@Data
public class DescontoPrevidenciario extends BaseEntityID {

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
    /**
     * Informa valor da Verba (Remuneração ou Desconto)
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valor;

}
