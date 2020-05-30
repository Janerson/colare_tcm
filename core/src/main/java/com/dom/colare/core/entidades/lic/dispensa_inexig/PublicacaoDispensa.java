
package com.dom.colare.core.entidades.lic.dispensa_inexig;

import com.dom.colare.core.entidades.shared.Publicacao;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * publicacao
 * <p>
 * Publicação da Dispensa ou Inexigibilidade de Licitação
 * 
 */
@Entity(name = "PUB_DISPENSA")
@PrimaryKeyJoinColumn(name = "id")
public class PublicacaoDispensa extends Publicacao {

}
