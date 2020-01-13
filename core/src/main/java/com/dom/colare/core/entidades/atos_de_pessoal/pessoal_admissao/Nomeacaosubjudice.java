
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * nomeacaosubjudice
 * <p>
 * Informar os dados de nomeação Sub Judice
 * 
 */
@Entity(name = "PES_ADM_SUBJUDI")
@Data
public class Nomeacaosubjudice extends BaseEntityID {

    /**
     * Informa se a nomeação foi ordenada por decisão judicial.
     * (Required)
     * 
     */
    @NotNull
    private Boolean candidatoNomeacaoSubJudice;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_ADM_SUBJUDI_ID")
    private Set<DetalhamentoNomeacaoSubJudice> detalhamentoNomeacaoSubJudice = new HashSet<>();

}
