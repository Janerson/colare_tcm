
package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * procedimentoDeContratacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idProcedimento for igual a "-1", com os dados do Procedimento de contratação (Licitação, Dispensa/Inexigibilidade ou Adesão a Registro de Preços).
 * 
 */
@Entity(name = "CONTRAT_PROCED")
@Data
public class ProcedimentoDeContratacao extends BaseEntityID {

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "1-Licitação", com os dados da licitação da qual resultou o contrato.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTR_PROC_LIC_ID")
    private LicitacaoInicial licitacaoInicial;

    /**
     * dispensaEInexigibilidade
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "2-Dispensa", com os dados da dispensa/inexigibilidade da qual resultou o contrato.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTR_PROC_DISP_ID")
    private DispensaEInexigibilidadeAte2018 dispensaEInexigibilidade;

    /**
     * adesaoARegistroDePrecos
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "3-Adesão a registro de preços", com os dados da adesão da qual resultou o contrato.
     * 
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private AdesaoARegistroDePrecosAte2018 adesaoARegistroDePrecos;



}
