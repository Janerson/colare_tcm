
package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * responsaveis
 * <p>
 * Responsáveis pelo contrato
 * 
 */
@Entity(name = "RESP_CONTR_INI")
@Data
@PrimaryKeyJoinColumn(name = "codigo")
public class ResponsavelContratoInicial extends Responsavel {

}
