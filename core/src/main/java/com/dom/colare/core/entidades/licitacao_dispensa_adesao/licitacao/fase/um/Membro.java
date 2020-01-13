
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * membro
 * <p>
 * Membros da comissão de licitação
 * 
 */
@Entity(name = "MEMBRO_FASE1")
@Data
public class Membro extends BaseEntityID {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    private String numeroCpf;
    /**
     * Código da atribuição do responsável pela licitação.
     * (Required)
     * 
     */
    @NotNull
    private Integer codAtribuicao;
    /**
     * Natureza do Cargo
     * (Required)
     * 
     */
    @NotNull
    private Integer codNaturezaCargo;

    
}
