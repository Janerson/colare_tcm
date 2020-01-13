
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal.homologacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * listaDeAprovados
 * <p>
 * Informa lista de aprovados, de acordo com a lista de classificação.
 * 
 */
@Entity(name = "PES_HOML_LSTAPR")
@Data
public class ListaDeAprovado extends BaseEntityID {

    /**
     * Tipo de Lista de Classificacao
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoListaClassificacao;
    /**
     * Informar a numero da classificação do candidato
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroOrdemClassificacao;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    private String numeroCpf;


}
