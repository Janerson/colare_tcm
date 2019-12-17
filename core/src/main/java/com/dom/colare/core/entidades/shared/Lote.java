
package com.dom.colare.core.entidades.shared;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;


/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 * 
 */
@Entity(name = "LOTE")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Lote extends BaseEntityID {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @Column
    public Integer numeroLote;
    /**
     * Descrição do Lote
     * 
     */
    @Column
    public String descricaoLote;
    /**
     * 
     * (Required)
     * 
     */
    @OneToMany(
            mappedBy = "lote",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<Item> item = null;

}
