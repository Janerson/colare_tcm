
package com.dom.colare.core.entidades.lic.dispensa_inexig;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * responsaveis
 * <p>
 * Responsáveis pela Dispensa
 * 
 */
@Entity(name = "RESP_DISP")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class ResponsavelDispensa extends Responsavel {

}
