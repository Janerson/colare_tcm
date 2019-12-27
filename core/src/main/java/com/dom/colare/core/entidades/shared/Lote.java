
package com.dom.colare.core.entidades.shared;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 * 
 */
@Entity
@Data
public abstract class Lote extends BaseEntityID {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer numeroLote;
    /**
     * Descrição do Lote
     * 
     */
    public String descricaoLote;


}
