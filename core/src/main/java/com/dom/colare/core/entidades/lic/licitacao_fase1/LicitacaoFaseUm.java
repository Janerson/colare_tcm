package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


/**
 * licitacaoFase1
 * <p>
 * Envio inicial dos dados da licitação - Abertura da licitação
 */
@Entity(name = "LICITACAOFASE1")
@Getter
@Setter
public class LicitacaoFaseUm extends BaseEntityID {
    /**
     * Exercício do edital da licitação
     * (Required)
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    @Column
    private Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull(message = "Número da licitação não pode ser nulo")
    @Column
    private Integer numeroLicitacao;
    /**
     * Data prevista para a sessão de recebimento da documentação
     * (Required)
     */
    @NotNull
    @Column
    private String dataPrevistaAberturaSessao;
    /**
     * Objeto
     * (Required)
     */
    @NotNull
    @Column
    private String objeto;

    /**
     * Número de convidados.
     */
    @DecimalMin(value = "1", message = "Número de convidados dever ser maior ou igual a {value}")
    @Column
    private Integer numeroDeConvidados;
    /**
     * Licitação com preferência para ME e EPP (Art. 44, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    private Boolean criterioDesempateMEEPP;
    /**
     * Destinação exclusiva a ME e EPP (Art. 48, I, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    private Boolean destinacaoExclusivaMEEPP;
    /**
     * Exigência de subcontratação de ME e EPP (Art. 48, II, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    private Boolean subcontratacaoMEEPP;
    /**
     * Estabeleceu limite percentual do objeto para a contratação de ME e EPP? (Art. 48, III, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    private Boolean limitePercObjetoContratacaoMEEPP;

    /**
     * Modalidade da Licitação
     * (Required)
     */
    @NotNull
    @Column
    private int codModalidadeLicitacao;

    /**
     * Natureza do Procedimento
     * (Required)
     */
    @NotNull
    @Column
    private int codNaturezaProcedimento;

    /**
     * Tipo de licitação
     */
    @Column
    private int codTipoLicitacaoCriterioJulgamento;

    /**
     * Regime de execução
     */
    @Column
    private int codRegimeExecucao;
    /**
     * Processo realizado por lote
     * (Required)
     */
    @NotNull
    @Column
    private Boolean processoPorLote;
    /**
     * Número do Processo Administrativo
     * (Required)
     */
    @NotNull
    @Column
    private String numeroProcessoAdministrativo;

    /**
     * Código da Natureza do Objeto
     * (Required)
     */
    @NotNull
    @Column
    private Integer codNaturezaObjeto;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     */
    private String idDocumentoPDF;

    /**
     * Código do Tipo de Envio
     * (Required)
     */
    @Column
    private Integer codTipoEnvio;

    /**
     * Descreve o motivo da Atualização ou Correção
     */
    @Column
    private String motivoAtualizacaoCorrecao;

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     */
    @DecimalMin("1")
    @NotNull
    @Column
    private Integer idUnidadeGestora;

    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     *
     @Column private String descricaoNaturezaObjetoOutros;*/

    /**
     * Trata-se de prestação de serviço a ser executado de forma contínua.
     * (Required)
     */
    @NotNull
    @Column
    private Boolean servicoContinuo;

    /**
     * Descreve o prêmio ou a remuneração do vencedor do Concurso.
     */
    @Column
    private String descricaoPremioOuRemuneracaoConcurso;

    /**
     * (Required)
     */
    //Size(min = 1)
    @Valid
    //@NotNull
    @OneToMany(
            mappedBy = "faseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @OrderBy("seq")
    //@JsonManagedReference
    private Set<LoteFaseUm> lote = new HashSet<>();

    /**
     * (Required)
     */
    //@Size(min = 1)
    @Valid
    //@NotNull
    @OneToMany(
            mappedBy = "faseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    //@JoinColumn(name = "LICITACAOFASE1_ID")
    private Set<ResposanvelFaseUm> responsaveis = new HashSet<>();

    /**
     * (Required)
     */
    //@Size(min = 1)
    @Valid
    // @NotNull
    @OneToMany(
            mappedBy = "faseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<ParecerFaseUm> parecer = new HashSet<>();
    /**
     * (Required)
     */
    //@Size(min = 1)
    @Valid
    // @NotNull
    @OneToMany(
            mappedBy = "faseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
   // @JoinColumn(name = "LICITACAOFASE1_ID")
    private Set<Comissao> comissao = new HashSet<>();


    //@Size(min = 1)
    @Valid
    // @NotNull
    @OneToMany(
            mappedBy = "faseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<RecursoOrcamentarioFaseUm> recursoOrcamentario = new HashSet<>();
    /**
     * (Required)
     */
    //@Size(min = 1)
    @Valid
    //@NotNull
    @OneToMany
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private Set<PublicacaoFaseUm> publicacao = new HashSet<>();

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private Set<EditalEAnexoFase1> editalEAnexos = new HashSet<>();

    /**
     * /*
     * (Required)
     */
    //@Size(min = 1)
    @Valid
    //@NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private Set<NaturezaObjetoDetalhadaFase1> naturezaDoObjetoDetalhada = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;

}
