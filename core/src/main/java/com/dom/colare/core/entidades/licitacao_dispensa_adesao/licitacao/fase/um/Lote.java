
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 * 
 */
@Entity
@Data
public class Lote extends BaseEntityID {

    /**
     * Número do Lote
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
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
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Item> item = null;

}
