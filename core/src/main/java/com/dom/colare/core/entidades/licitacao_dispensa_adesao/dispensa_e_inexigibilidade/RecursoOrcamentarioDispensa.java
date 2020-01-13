
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import com.dom.colare.core.entidades.shared.RecursoOrcamentario;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * recursoOrcamentario
 * <p>
 * Recurso Orçamentário para a realização da contratação por dispensa
 * 
 */
@Entity(name = "RECORC_DISP")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class RecursoOrcamentarioDispensa extends RecursoOrcamentario {

    @Size(min = 1)
    @NotNull
    @OneToMany
    @JoinColumn(name ="RECORC_DISP_ID" )
    private Set<DotacaoDispensa> dotacao = new HashSet<>();
}
