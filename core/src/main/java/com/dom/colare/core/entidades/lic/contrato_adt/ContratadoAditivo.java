
package com.dom.colare.core.entidades.lic.contrato_adt;

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
@Entity(name = "CONTRATADO_ADT")
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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATADO_ADT_ID")
    public Set<ItemAditivado> itemAditivado = new HashSet<>();

    @Valid
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATADO_ADT_ID")
    public Set<QuadroSocietarioAditivo> quadroSocietario = new HashSet<>();


}
