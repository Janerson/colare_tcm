
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;


/**
 * parecer
 * <p>
 * Parecer da Licitação
 * 
 */
@Entity
@Data
public class Parecer extends BaseEntityID {

    /**
     * Data do parecer
     * (Required)
     * 
     */
    public String dataParecer;
    /**
     * Código do Tipo do parecer
     * (Required)
     * 
     */
    public Integer codTipoParecer;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    public String numeroCpf;
    /**
     * Número do registro no órgão de classe
     * (Required)
     * 
     */
    public String numeroRegistroOrgaoDeClasse;
    /**
     * Código IBGE do Estado onde foi realizado o registro no órgão de classe
     * (Required)
     * 
     */
    public Integer codUfRegistroOrgaoDeClasse;


}
