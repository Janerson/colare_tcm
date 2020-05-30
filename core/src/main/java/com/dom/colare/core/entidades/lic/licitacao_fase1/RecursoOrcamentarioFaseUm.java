
package com.dom.colare.core.entidades.lic.licitacao_fase1;

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
 * Detalhamento dos Recursos Orçamentários
 * 
 */
@Entity(name = "RECORC_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class RecursoOrcamentarioFaseUm extends RecursoOrcamentario {

    @Size(min = 1)
    @NotNull
    @OneToMany
    @JoinColumn(name = "RECORC_FASE1_ID")
    private Set<DotacaoFaseUm> dotacao = new HashSet<>();

}
