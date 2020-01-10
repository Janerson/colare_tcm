
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

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
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class DotacaoDispensa extends Dotacao {

}
