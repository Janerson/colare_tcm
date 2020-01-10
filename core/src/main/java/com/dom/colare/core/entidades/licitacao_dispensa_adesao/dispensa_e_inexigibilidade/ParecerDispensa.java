
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

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
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class ParecerDispensa extends Parecer {

}
