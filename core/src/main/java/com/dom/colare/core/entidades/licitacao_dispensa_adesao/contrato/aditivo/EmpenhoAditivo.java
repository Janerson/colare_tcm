
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.Empenho;
import lombok.Data;

import javax.persistence.Entity;

/**
 * empenho
 * <p>
 * Dados do empenho decorrente do contrato aditivo
 * 
 */
@Entity(name = "EMP_CONTRAT_ADT")
@Data
public class EmpenhoAditivo extends Empenho {

}
