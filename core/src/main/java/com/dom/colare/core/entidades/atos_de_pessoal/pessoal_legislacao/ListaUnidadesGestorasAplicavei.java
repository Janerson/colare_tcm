
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import javax.validation.constraints.NotNull;


/**
 * listaUnidadesGestorasAplicaveis
 * <p>
 * Informar todas as Unidades Gestoras, as quais a Norma/Legislação aplica-se.
 * 
 */
public class ListaUnidadesGestorasAplicavei {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public Integer getIdUnidadeGestora() {
        return idUnidadeGestora;
    }

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public void setIdUnidadeGestora(Integer idUnidadeGestora) {
        this.idUnidadeGestora = idUnidadeGestora;
    }

}
