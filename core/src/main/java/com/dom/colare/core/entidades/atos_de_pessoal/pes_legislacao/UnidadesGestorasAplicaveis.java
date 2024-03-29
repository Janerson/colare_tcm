
package com.dom.colare.core.entidades.atos_de_pessoal.pes_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * unidadesGestorasAplicaveis
 * <p>
 * Informa todas as Unidades Gestoras, as quais a presente Norma/Legislação é Aplicável. 
 * 
 */
@Entity(name = "PES_UG_APLICNOR")
@Data
public class UnidadesGestorasAplicaveis extends BaseEntityID {

    /**
     * Identifica se a norma e aplicável a todas as Unidades Gestoras
     * (Required)
     * 
     */
    @NotNull
    private Boolean normaAplicavelATodasAsUnidadesGestoras;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_UG_APLICNOR_ID")
    private Set<ListaUnidadesGestorasAplicaveis> listaUnidadesGestorasAplicaveis = null;

}
