
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal.homologacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * listaClassificacaoCargo
 * <p>
 * Informa a lista de classificação por cargo
 * 
 */
@Entity(name = "PES_HOML_CARGO")
@Data
public class ListaClassificacaoCargo extends BaseEntityID {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_HOML_CARGO")
    private Set<ListaDeAprovado> listaDeAprovados = null;

}
