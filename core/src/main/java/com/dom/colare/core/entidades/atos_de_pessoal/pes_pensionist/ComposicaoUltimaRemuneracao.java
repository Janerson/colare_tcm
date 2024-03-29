
package com.dom.colare.core.entidades.atos_de_pessoal.pes_pensionist;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * composicaoUltimaRemuneracao
 * <p>
 * Contém a composição da ultima remuneração.
 * 
 */
@Entity(name = "PES_PENS_ULTREM")
@Data
public class ComposicaoUltimaRemuneracao extends BaseEntityID {

    /**
     * Informa o ID de uma entrega do Layout de Pessoal Concessão Vantagem Desconto
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalConcessaoVantagemDesconto;

}
