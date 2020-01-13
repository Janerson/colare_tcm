
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * publicacao
 * <p>
 * Publicação do contrato.
 * 
 */
@Entity(name = "PUB_CONTRAT_INI")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class PublicacaoInicial extends Publicacao {

}
