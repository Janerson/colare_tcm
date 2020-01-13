
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
 * 
 */
@Entity(name = "RESC_CONTR_ORIG")
@Data
public class ContratoOriginalRecisao extends BaseEntityID {


    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
     * 
     */
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "RESC_CONT_LICIT_ID")
    private LicitacaoRecisao licitacao;

}
