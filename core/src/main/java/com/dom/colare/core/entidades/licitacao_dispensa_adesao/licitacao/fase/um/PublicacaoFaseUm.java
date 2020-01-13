
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * publicacao
 * <p>
 * Informação de todas as publicações do Edital ou Convite
 * 
 */
@Entity(name = "PUB_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class PublicacaoFaseUm extends Publicacao {

}
