
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * unidadesGestorasAplicaveis
 * <p>
 * Informa todas as Unidades Gestoras, as quais a presente Norma/Legislação é Aplicável. 
 * 
 */
public class UnidadesGestorasAplicaveis {

    /**
     * Identifica se a norma e aplicável a todas as Unidades Gestoras
     * (Required)
     * 
     */
    @NotNull
    private Boolean normaAplicavelATodasAsUnidadesGestoras;
    @Valid
    private Set<ListaUnidadesGestorasAplicavei> listaUnidadesGestorasAplicaveis = null;

    /**
     * Identifica se a norma e aplicável a todas as Unidades Gestoras
     * (Required)
     * 
     */
    public Boolean getNormaAplicavelATodasAsUnidadesGestoras() {
        return normaAplicavelATodasAsUnidadesGestoras;
    }

    /**
     * Identifica se a norma e aplicável a todas as Unidades Gestoras
     * (Required)
     * 
     */
    public void setNormaAplicavelATodasAsUnidadesGestoras(Boolean normaAplicavelATodasAsUnidadesGestoras) {
        this.normaAplicavelATodasAsUnidadesGestoras = normaAplicavelATodasAsUnidadesGestoras;
    }

    public Set<ListaUnidadesGestorasAplicavei> getListaUnidadesGestorasAplicaveis() {
        return listaUnidadesGestorasAplicaveis;
    }

    public void setListaUnidadesGestorasAplicaveis(Set<ListaUnidadesGestorasAplicavei> listaUnidadesGestorasAplicaveis) {
        this.listaUnidadesGestorasAplicaveis = listaUnidadesGestorasAplicaveis;
    }

}
