package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

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
 * licitacaoFase1
 * <p>
 * Envio inicial dos dados da licitação - Abertura da licitação
 */
@Entity
@Data
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
    @NotNull
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
    @DecimalMin("1")
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
    @NotNull
    private String idDocumentoPDF;

    /**
     * Código do Tipo de Envio
     * (Required)
     */
    @NotNull
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
     */
    @Column
    private String descricaoNaturezaObjetoOutros;

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
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "licitacao_um_id")
    private Set<LoteFaseUm> lote = new HashSet<>();

    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "licitacao_um_id")
    private Set<ResposanvelFaseUm> responsaveis = new HashSet<>();

    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "licitacao_um_id")
    private Set<ParecerFaseUm> parecerFaseUm = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "licitacao_um_id")
    private Set<Comissao> comissao = new HashSet<>();


    @Valid
    @OneToMany
    @JoinColumn(name = "licitacao_um_id")
    private Set<RecursoOrcamentarioFaseUm> recursoOrcamentarios = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "licitacao_um_id")
    private Set<PublicacaoFaseUm> publicacao = new HashSet<>();

}
