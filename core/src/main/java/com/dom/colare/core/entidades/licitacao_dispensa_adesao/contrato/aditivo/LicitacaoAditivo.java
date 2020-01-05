
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.Licitacao;
import lombok.Data;

import javax.persistence.Entity;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original e o seu aditivo.
 * 
 */
@Entity
@Data
public class LicitacaoAditivo extends Licitacao {

}
