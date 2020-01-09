
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * procedimentoDeContratacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idProcedimento for igual a "-1", com os dados do Procedimento de contratação (Licitação, Dispensa/Inexigibilidade ou Adesão a Registro de Preços).
 * 
 */
@Entity
@Data
public class ProcedimentoDeContratacao extends BaseEntityID {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "1-Licitação", com os dados da licitação da qual resultou o contrato.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "procedimentoDeContratacao")
    public LicitacaoInicial licitacaoInicial;

    /**
     * dispensaEInexigibilidade
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "2-Dispensa", com os dados da dispensa/inexigibilidade da qual resultou o contrato.
     * 
     */
    @Valid
    public DispensaEInexigibilidadeAte2018 dispensaEInexigibilidadeAte2018;

    /**
     * adesaoARegistroDePrecos
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "3-Adesão a registro de preços", com os dados da adesão da qual resultou o contrato.
     * 
     */
    @Valid
    public AdesaoARegistroDePrecosAte2018 adesaoARegistroDePrecosAte2018;

    @OneToOne
    @MapsId
    private ContratoInicial contratoInicial;

}
