
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal.homologacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
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
    @JoinColumn(name = "PES_HOML_CARGO", foreignKey = @ForeignKey(name = "FK_CARGO_APROV_ID"))
    private Set<ListaDeAprovado> listaDeAprovados = new HashSet<>();

}
