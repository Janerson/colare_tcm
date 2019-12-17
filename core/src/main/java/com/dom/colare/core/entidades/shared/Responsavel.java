
package com.dom.colare.core.entidades.shared;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * responsaveis
 * <p>
 * Detalhamento dos Responsáveis pela licitação
 * 
 */
@Entity
@Data
public class Responsavel extends BaseEntityID {

    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    @Column
    public Integer codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @Column
    public String numeroCpf;

}
