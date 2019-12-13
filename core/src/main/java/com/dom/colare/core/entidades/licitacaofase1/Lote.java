
package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;


/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 * 
 */
@Entity(name = "LOTE")
@Data
public class Lote extends BaseEntityID {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    public Integer numeroLote;
    /**
     * Descrição do Lote
     * 
     */
    public String descricaoLote;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Item> item = null;

}
