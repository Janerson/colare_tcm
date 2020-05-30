
package com.dom.colare.core.entidades.lic.contrato_adt;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;


/**
 * publicacao
 * <p>
 * Publicação do contrato aditivo
 * 
 */
@Entity(name = "PUB_CONTRAT_ADT")
@Data
public class PublicacaoAditivo extends Publicacao {
}
