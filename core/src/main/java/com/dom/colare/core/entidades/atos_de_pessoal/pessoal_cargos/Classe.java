
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

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
 * classe
 * <p>
 * Informar as Classes do Cargo
 * 
 */
@Entity(name = "PES_CARGO_CLASS")
@Data
public class Classe extends BaseEntityID {

    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    @NotNull
    private Integer codClasse;
    /**
     * Descrição da nomenclatura da Classe do Cargo conforme Lei
     * (Required)
     * 
     */
    @NotNull
    private String descricaoClasse;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGO_CLASS_ID")
    private Set<PadraoNivel> padraonivel = null;



}
