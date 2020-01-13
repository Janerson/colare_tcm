
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

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
