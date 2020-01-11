
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * listaUnidadesGestorasAplicaveis
 * <p>
 * Informar todas as Unidades Gestoras, as quais a Norma/Legislação aplica-se.
 * 
 */
@Entity
@Data
public class ListaUnidadesGestorasAplicaveis extends BaseEntityID {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;


}
