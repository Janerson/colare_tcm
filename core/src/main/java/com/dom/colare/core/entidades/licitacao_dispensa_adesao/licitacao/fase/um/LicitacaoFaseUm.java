package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.dominio.*;
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
    public Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull
    @Column
    public Integer numeroLicitacao;
    /**
     * Data prevista para a sessão de recebimento da documentação
     * (Required)
     */
    @NotNull
    @Column
    public String dataPrevistaAberturaSessao;
    /**
     * Objeto
     * (Required)
     */
    @NotNull
    @Column
    public String objeto;
    /**
     * Número de convidados.
     */
    @DecimalMin("1")
    @Column
    public Integer numeroDeConvidados;
    /**
     * Licitação com preferência para ME e EPP (Art. 44, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    public Boolean criterioDesempateMEEPP;
    /**
     * Destinação exclusiva a ME e EPP (Art. 48, I, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    public Boolean destinacaoExclusivaMEEPP;
    /**
     * Exigência de subcontratação de ME e EPP (Art. 48, II, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    public Boolean subcontratacaoMEEPP;
    /**
     * Estabeleceu limite percentual do objeto para a contratação de ME e EPP? (Art. 48, III, Lei Complementar 123/2006)
     * (Required)
     */
    @NotNull
    @Column
    public Boolean limitePercObjetoContratacaoMEEPP;
    /**
     * Modalidade da Licitação
     * (Required)
     */
    @NotNull
    @OneToOne
    @JoinColumn(name = "codModalidadeLicitacao", referencedColumnName = "codigo")
    public ModalidadeLicitacao codModalidadeLicitacao;
    /**
     * Natureza do Procedimento
     * (Required)
     */
    @NotNull
    @OneToOne
    @JoinColumn(name = "codNaturezaProcedimento", referencedColumnName = "codigo")
    public NaturezaProcedimento codNaturezaProcedimento;
    /**
     * Tipo de licitação
     */
    @JoinColumn(name = "codTipoLicitacaoCriterioJulgamento", referencedColumnName = "codigo")
    public TipoLicitacaoCriterioJulgamento codTipoLicitacaoCriterioJulgamento;
    /**
     * Regime de execução
     */
    @JoinColumn(name = "codRegimeExecucao", referencedColumnName = "codigo")
    public RegimeExecucao codRegimeExecucao;
    /**
     * Processo realizado por lote
     * (Required)
     */
    @NotNull
    @Column
    public Boolean processoPorLote;
    /**
     * Número do Processo Administrativo
     * (Required)
     */
    @NotNull
    @Column
    public String numeroProcessoAdministrativo;
    /**
     * Código da Natureza do Objeto
     * (Required)
     */
    @NotNull
    @JoinColumn(name = "codNaturezaObjeto", referencedColumnName = "codigo")
    public NaturezaObjeto codNaturezaObjeto;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     */
    @NotNull
    @JoinColumn(name = "codTipoEnvio", referencedColumnName = "codigo")
    public TipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     */
    @DecimalMin("1")
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     */
    public String descricaoNaturezaObjetoOutros;
    /**
     * Trata-se de prestação de serviço a ser executado de forma contínua.
     * (Required)
     */
    @NotNull
    public Boolean servicoContinuo;
    /**
     * Descreve o prêmio ou a remuneração do vencedor do Concurso.
     */
    public String descricaoPremioOuRemuneracaoConcurso;
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
    public Set<LoteFaseUm> lote = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Responsavel> responsaveis = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Parecer> parecer = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Comissao> comissao = new HashSet<>();


    @Valid
    public Set<RecursoOrcamentario> recursoOrcamentario = new HashSet<>();
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Publicacao> publicacao = new HashSet<>();

}
