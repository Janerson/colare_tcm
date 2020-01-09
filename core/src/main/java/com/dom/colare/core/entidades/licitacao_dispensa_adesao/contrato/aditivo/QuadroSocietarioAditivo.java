
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.QuadroSocietario;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 * quadroSocietario
 * <p>
 * Quadro societário do contratado
 * 
 */
@Entity
@Data
public class QuadroSocietarioAditivo extends QuadroSocietario {

    @ManyToOne
    private ContratadoAditivo contratadoAditivo;
}
