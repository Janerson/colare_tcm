
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

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
public class Classe {

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
    private Set<Padraonivel> padraonivel = null;

    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    public Integer getCodClasse() {
        return codClasse;
    }

    /**
     * Codificação, interna do sistema de gestão, para a Classe
     * (Required)
     * 
     */
    public void setCodClasse(Integer codClasse) {
        this.codClasse = codClasse;
    }

    /**
     * Descrição da nomenclatura da Classe do Cargo conforme Lei
     * (Required)
     * 
     */
    public String getDescricaoClasse() {
        return descricaoClasse;
    }

    /**
     * Descrição da nomenclatura da Classe do Cargo conforme Lei
     * (Required)
     * 
     */
    public void setDescricaoClasse(String descricaoClasse) {
        this.descricaoClasse = descricaoClasse;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Set<Padraonivel> getPadraonivel() {
        return padraonivel;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setPadraonivel(Set<Padraonivel> padraonivel) {
        this.padraonivel = padraonivel;
    }

}
