
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

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
@Entity
@Data
public class CotacaoPropria extends BaseEntityID {

    /**
     * Identifica o tipo do documento
     * 
     */
    @Column
    public Integer codTipoDocumento;

    /**
     * Número do documento
     * 
     */
    @Column
    public String numeroDocumento;

    /**
     * Data da cotação
     * (Required)
     * 
     */
    @NotNull
    @Column
    public String dataCotacao;

    /**
     * Valor Unitário
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    public Double valorUnitario;

    /**
     * Quantidade
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    public Double quantidade;

    /**
     * Código da origem do valor de referência
     * (Required)
     * 
     */
    @NotNull
    @Column
    public Integer codOrigemValorReferencia;

    /**
     * Descreve onde foi obtido o valor de referência.
     * 
     */
    @Column
    public String descricaoOrigemValorReferencia;


}
