
package com.dom.colare.core.entidades.lic.dispensa_inexig;

import com.dom.colare.core.entidades.shared.Parecer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * parecer
 * <p>
 * Pareceres Técnicos da Dispensa
 * 
 */
@Entity(name = "PAREC_DISP")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class ParecerDispensa extends Parecer {

}
