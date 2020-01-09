
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.Empenho;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * empenho
 * <p>
 * Dados do empenho decorrente do contrato aditivo
 * 
 */
@Entity
@Data
public class EmpenhoAditivo extends Empenho {

    @ManyToOne
    private ContratoAditivo contratoAditivo;

}
