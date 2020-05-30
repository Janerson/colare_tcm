
package com.dom.colare.core.entidades.lic.adesao_reg_prec;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * cotacaoPropria
 * <p>
 * Dados da cotação de preços para a adesão
 * 
 */
@Entity(name = "COTACAO_ADESAO")
@Data
public class CotacaoPropria extends BaseEntityID {

    /**
     * Identifica o tipo do documento
     * 
     */
    @Column
    private Integer codTipoDocumento;

    /**
     * Número do documento
     * 
     */
    @Column
    private String numeroDocumento;

    /**
     * Data da cotação
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataCotacao;

    /**
     * Valor Unitário
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double valorUnitario;

    /**
     * Quantidade
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double quantidade;

    /**
     * Código da origem do valor de referência
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codOrigemValorReferencia;

    /**
     * Descreve onde foi obtido o valor de referência.
     * 
     */
    @Column
    private String descricaoOrigemValorReferencia;


}
