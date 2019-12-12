
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;


/**
 * membro
 * <p>
 * Membros da comissão de licitação
 * 
 */
@Entity(name = "MEMBRO")
@Data
public class Membro extends BaseEntityID {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    public String numeroCpf;
    /**
     * Código da atribuição do responsável pela licitação.
     * (Required)
     * 
     */
    public int codAtribuicao;
    /**
     * Natureza do Cargo
     * (Required)
     * 
     */
    public int codNaturezaCargo;



}
