
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import com.dom.colare.core.entidades.shared.Licitacao;
import lombok.Data;

import javax.persistence.Entity;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
 * 
 */
@Entity(name = "RESC_CONT_LICIT")
@Data
public class LicitacaoRecisao extends Licitacao {

}
