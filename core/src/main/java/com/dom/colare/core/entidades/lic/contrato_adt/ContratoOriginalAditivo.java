
package com.dom.colare.core.entidades.lic.contrato_adt;

import com.dom.colare.core.entidades.shared.ContratoOriginal;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1,
 * com os dados do contrato original que está sendo aditivado.
 * 
 */
@Entity(name = "ADTV_CONTR_ORIG")
@Data
public class ContratoOriginalAditivo extends ContratoOriginal {

    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação,
     * com os dados da licitação da qual resultou o contrato original e o seu aditivo.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "ADTV_CONT_LICIT_ID")
    public LicitacaoAditivo licitacao;

}
