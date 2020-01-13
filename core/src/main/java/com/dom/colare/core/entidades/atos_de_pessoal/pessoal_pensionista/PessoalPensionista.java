
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalPensionista
 * <p>
 * Dados de Pensionista
 * 
 */
@Entity(name = "PES_PENSIONIST")
@Data
public class PessoalPensionista extends BaseEntityID {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * Informa o Tipo de Pensão, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoPensao;
    /**
     * Informa se a pessoa era pensionista antes do exercício do 2020, ou seja, se ela foi informada ao TCMGO antes do COLARE PESSOAL. 
     * (Required)
     * 
     */
    @NotNull
    private Boolean pensionistaAnterior2020;
    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * dadosDaPensao
     * <p>
     * Informa os dados da instituição Pensão de servidores anteriores a 2020.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_PENS_DADOS_ID")
    private DadosDaPensao dadosDaPensao;
    /**
     * pensaoRpps
     * <p>
     * Contém as informações sobre os pensionistas RPPS, (exceto Judicial e Merce)
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_PENS_P_RPPS_ID")
    private PensaoRpps pensaoRpps;
    /**
     * pensaoJudicial
     * <p>
     * Contém os dados das Pensões Judiciais.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_PENS_P_JUD_ID")
    private PensaoJudicial pensaoJudicial;
    /**
     * pensaoMerce
     * <p>
     * Contem as informações Pensão Mercê.
     * 
     */
    @Valid
    @OneToOne
    @JoinColumn(name = "PES_PENS_MERCE_ID")
    private PensaoMerce pensaoMerce;
    /**
     * requisitosFinanceiros
     * <p>
     * Contém os dados dos proventos do pensionista.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_PENS_FIN_ID")
    private RequisitosFinanceiros requisitosFinanceiros;


}
