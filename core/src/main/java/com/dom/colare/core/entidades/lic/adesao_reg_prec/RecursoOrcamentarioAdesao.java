
package com.dom.colare.core.entidades.lic.adesao_reg_prec;

import com.dom.colare.core.entidades.shared.RecursoOrcamentario;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * recursoOrcamentario
 * <p>
 * Recurso Orçamentário para a realização da adesão
 * 
 */
@Entity(name = "RECORC_ADESAO")
@Data
public class RecursoOrcamentarioAdesao extends RecursoOrcamentario {
    /**
     *
     * (Required)
     *
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "RECORC_ADESAO_ID")
    public Set<DotacaoAdesao> dotacao = new HashSet<>();

}
