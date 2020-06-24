
package com.dom.colare.core.entidades.lic.adesao_reg_prec;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * responsaveis
 * <p>
 * Responsáveis pela adesão ao registro de preços
 * 
 */
@Entity(name = "RESP_ADESAO")
@Data
@PrimaryKeyJoinColumn(name = "codigo")
public class ResponsavelAdesao extends Responsavel {

}
