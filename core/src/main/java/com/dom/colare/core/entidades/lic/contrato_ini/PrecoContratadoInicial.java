
package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.PrecoContratado;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * precoContratado
 * <p>
 * Preço contratado por item
 * 
 */
@Entity(name = "PRECO_CONTRAT")
@Data
public class PrecoContratadoInicial extends PrecoContratado {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @NotNull
    public Integer numeroLote;


}
