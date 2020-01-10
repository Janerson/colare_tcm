
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

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
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class RecursoOrcamentarioFaseUm extends RecursoOrcamentario {

    @Size(min = 1)
    @NotNull
    @OneToMany
    @JoinColumn(name = "recurso_id")
    private Set<DotacaoFaseUm> dotacao = new HashSet<>();

}
