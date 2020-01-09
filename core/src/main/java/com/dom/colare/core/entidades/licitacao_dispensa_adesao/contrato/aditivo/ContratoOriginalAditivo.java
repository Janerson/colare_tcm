
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um.LicitacaoFaseUm;
import com.dom.colare.core.entidades.shared.ContratoOriginal;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.Valid;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo aditivado.
 * 
 */
@Entity
@Data
public class ContratoOriginalAditivo extends ContratoOriginal {


    @OneToOne
    @MapsId
    private ContratoAditivo contratoAditivo;

    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original e o seu aditivo.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "licitacao_id", referencedColumnName = "id")
    public LicitacaoFaseUm licitacao;

}
