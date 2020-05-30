
package com.dom.colare.core.entidades.lic.contrato_adt;

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
