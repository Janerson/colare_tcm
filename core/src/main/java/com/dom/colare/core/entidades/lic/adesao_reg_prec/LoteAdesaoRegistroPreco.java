
package com.dom.colare.core.entidades.lic.adesao_reg_prec;

import com.dom.colare.core.entidades.shared.Lote;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * lote
 * <p>
 * Dados do lote do registro de preços
 * 
 */
@Entity(name = "LOTE_ADESAO")
@Data
public class LoteAdesaoRegistroPreco extends Lote {

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "LOTE_ADESAO_ID")
    private Set<ItemAdesaoRegistroPreco> item = new HashSet<>();

}
