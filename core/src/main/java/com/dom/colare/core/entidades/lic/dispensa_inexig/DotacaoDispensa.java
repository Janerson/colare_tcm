
package com.dom.colare.core.entidades.lic.dispensa_inexig;

import com.dom.colare.core.entidades.shared.Dotacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * dotacao
 * <p>
 * Dotação orçamentária
 * 
 */
@Entity(name = "DOTACAO_DISP")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class DotacaoDispensa extends Dotacao {

}
