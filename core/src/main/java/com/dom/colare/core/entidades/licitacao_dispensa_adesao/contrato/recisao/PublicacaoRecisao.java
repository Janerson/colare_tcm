
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * publicacao
 * <p>
 * Publicação da rescisão contratual
 * 
 */
@Entity(name = "PUB_CONTRAT_RES")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class PublicacaoRecisao  extends Publicacao {

}
