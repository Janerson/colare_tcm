
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import com.dom.colare.core.entidades.shared.Licitacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
 * 
 */
@Entity
@Data
public class LicitacaoRecisao extends Licitacao {

    @OneToOne
    @MapsId
    private ContratoOriginalRecisao contratoOriginalRecisao;
}
