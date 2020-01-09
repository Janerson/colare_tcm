
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.PrecoContratado;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


/**
 * precoContratado
 * <p>
 * Preço contratado por item
 * 
 */
@Entity
@Data
public class PrecoContratadoInicial extends PrecoContratado {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @NotNull
    public Integer numeroLote;

    @ManyToOne
    private ContratadoInicial contratadoInicial;

}
