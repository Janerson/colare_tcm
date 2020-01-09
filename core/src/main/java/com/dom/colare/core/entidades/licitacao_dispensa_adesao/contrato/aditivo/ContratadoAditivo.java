
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.Contratado;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * contratado
 * <p>
 * Dados do contratado
 * 
 */
@Entity
@Data
public class ContratadoAditivo extends Contratado {

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "contratadoAditivo")
    public Set<ItemAditivado> itemAditivado = new HashSet<>();

    @Valid
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "contratadoAditivo")
    public Set<QuadroSocietarioAditivo> quadroSocietarioAditivo = null;

    @OneToOne
    @MapsId
    private ContratoAditivo contratoAditivo;

}
