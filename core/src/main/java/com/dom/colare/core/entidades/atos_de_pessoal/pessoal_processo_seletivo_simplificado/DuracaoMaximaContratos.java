
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * duracaoMaximaContratos
 * <p>
 * Informa a Duracao Maxima dos Contratos
 * 
 */
@Entity
@Data
public class DuracaoMaximaContratos extends BaseEntityID {

    /**
     * Tipo de prazo
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoPrazo;
    /**
     * Prazo de Duração
     * (Required)
     * 
     */
    @NotNull
    private Integer prazoDeDuracao;
    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    private String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;


}
