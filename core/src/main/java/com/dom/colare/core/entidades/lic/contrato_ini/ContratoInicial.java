package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * contratoInicial
 * <p>
 * Dados do contrato
 */
@Entity(name = "CONTRATO_INI")
@Data
public class ContratoInicial extends BaseEntityID {

    /**
     * Tipo do procedimento
     * (Required)
     */
    @NotNull
    @Column
    private Integer codTipoProcedimento;

    /**
     * ID do procedimento do qual decorre o contrato
     * (Required)
     */
    @NotNull
    @Column
    private Integer idProcedimento;

    /**
     * Número do contrato
     */
    @Column
    private String numeroContrato;

    /**
     * Ano do contrato
     * (Required)
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    @Column
    private Integer anoContrato;

    /**
     * Data da firmatura do documento
     */
    @Column
    private String dataFirmatura;

    /**
     * Data do início da vigência
     */
    @Column
    private String inicioVigencia;

    /**
     * Data do fim da vigência
     */
    @Column
    private String fimVigencia;

    /**
     * Código da Natureza do Objeto
     * (Required)
     */
    @Column
    @NotNull
    private Integer codNaturezaObjeto;

    /**
     * Objeto
     * (Required)
     */
    @NotNull
    @Column
    private String objeto;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     */
    @NotNull
    @Column
    private String idDocumentoPDF;

    /**
     * Código do Tipo de Envio
     * (Required)
     */
    @NotNull
    private Integer codTipoEnvio;

    /**
     * Descreve o motivo da Atualização ou Correção
     */
    @Column
    private String motivoAtualizacaoCorrecao;

    /**
     * Tipo de formalização do contrato
     * (Required)
     */
    @Column
    @NotNull
    private Integer codTipoFormalizacaoContrato;

    /**
     * Descrição da forma de pagamento
     * (Required)
     */
    @NotNull
    @Column
    private String formaPagamento;

    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * (Required)
     */
    @NotNull
    @Column
    private Integer codUnidadeMedidaPrazoExecucao;
    /**
     * Prazo para entrega do objeto ou execução do contrato
     * (Required)
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Integer prazoExecucao;

    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     */
    @Column
    private String descricaoNaturezaObjetoOutros;

    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_INI_ID")
    private Set<PublicacaoInicial> publicacao = new HashSet<>();
    /**
     * contratado
     * <p>
     * Dados do contratado
     * (Required)
     */
    @Valid
    @NotNull
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATADO_INI_ID")
    private ContratadoInicial contratado;

    @Valid
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_INI_ID")
    private Set<EmpenhoInicial> empenhoInicial = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_INI_ID")
    private Set<ResponsavelContratoInicial> responsaveis = new HashSet<>();
    /**
     * procedimentoDeContratacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idProcedimento for igual a "-1", com os dados do Procedimento de contratação (Licitação, Dispensa/Inexigibilidade ou Adesão a Registro de Preços).
     */
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRAT_PROCED_ID")
    private ProcedimentoDeContratacao procedimentoDeContratacao;

    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTRATO_INI_ID")
    private Set<NaturezaObjetoDetalhadaContratoInicial> naturezaDoObjetoDetalhada = new HashSet<>();
}
