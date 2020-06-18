
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * requisitosDeProvimento
 * <p>
 * Informar os requisitos de provimento do cargo
 * 
 */
@Entity(name = "PES_CARGO_REQPR")
@Data
public class RequisitosDeProvimento extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Artigo da Legislação ou Norma
     * (Required)
     * 
     */
    @NotNull
    private String artigo;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;



}
