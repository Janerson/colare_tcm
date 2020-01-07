
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.RecursoOrcamentario;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Entity
@Data
public class RecursoOrcamentarioAdesao extends RecursoOrcamentario {

    @ManyToOne
    private AdesaoARegistroDePrecos adesaoARegistroDePrecos;

    /**
     *
     * (Required)
     *
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch =  FetchType.EAGER, mappedBy = "recursoOrcamentarioAdesao")
    public Set<DotacaoAdesao> dotacao = new HashSet<>();

}
