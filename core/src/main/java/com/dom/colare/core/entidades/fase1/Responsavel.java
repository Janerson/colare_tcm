
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

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
    public Integer codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    public String numeroCpf;

}
