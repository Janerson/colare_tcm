
package com.dom.colare.core.entidades.shared;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 * 
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data
@DynamicUpdate
public abstract class Lote extends BaseEntityID {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull(message = "Informe o número do lote.")
    private Integer numeroLote;
    /**
     * Descrição do Lote
     * 
     */
    private String descricaoLote;


}
