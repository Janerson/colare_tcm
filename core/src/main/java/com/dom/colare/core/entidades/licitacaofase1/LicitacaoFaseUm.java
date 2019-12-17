
package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.BaseEntityID;
import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * licitacaoFase1
 * <p>
 * Envio inicial dos dados da licitação - Abertura da licitação
 * 
 */
@Entity(name = "LICITACAO_FASE_UM")
@Data
public class LicitacaoFaseUm extends BaseEntityID {

    /**
     * Exercício do edital da licitação
     * Ano do Edital com 4 dígitos (AAAA)
     * (Required)
     * 
     */
    @Size(min = 4, max = 4)
    @Column
    public Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     * Número sequencial da modalidade de licitação,
     * por exercício (ex. Concorrência nº 3, Pregão nº 28)
     * 
     */
    @Column
    public Integer numeroLicitacao;
    /**
     * Data prevista para a sessão de recebimento da documentação
     * (Required)
     * 
     */
    @Column(length = 10)
    public String dataPrevistaAberturaSessao;
    /**
     * Descrever o objeto licitado.
     * (Required)
     * 
     */
    @Column
    public String objeto;
    /**
     * Preencher somente e obrigatoriamente se a Modalidade = Convite
     * 
     */
    @Column
    public Integer numeroDeConvidados;
    /**
     * Licitação com preferência para ME e EPP (Art. 44, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @Type(type = "true_false")
    @Column
    public Boolean criterioDesempateMEEPP;
    /**
     * Destinação exclusiva a ME e EPP (Art. 48, I, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @Type(type = "true_false")
    @Column
    public Boolean destinacaoExclusivaMEEPP;
    /**
     * Exigência de subcontratação de ME e EPP (Art. 48, II, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @Column
    public Boolean subcontratacaoMEEPP;
    /**
     * Estabeleceu limite percentual do objeto para a contratação de ME e EPP? (Art. 48, III, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @Column
    public Boolean limitePercObjetoContratacaoMEEPP;
    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    @Column
    public int codModalidadeLicitacao;
    /**
     * Natureza do Procedimento
     * (Required)
     * 
     */
    @Column
    public int codNaturezaProcedimento;
    /**
     * Tipo de licitação
     * 
     */
    @Column
    public int codTipoLicitacaoCriterioJulgamento;
    /**
     * Regime de execução
     * 
     */
    @Column
    public int codRegimeExecucao;
    /**
     * Processo realizado por lote
     * (Required)
     * 
     */
    @Column
    public Boolean processoPorLote;
    /**
     * Número do Processo Administrativo
     * (Required)
     * Número do processo administrativo licitatório, incluindo o ano com quatro dígitos (NNNNNN/AAAA)
     */
    @Column
    public String numeroProcessoAdministrativo;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * Conforme tabela Natureza do Objeto. Não preencher quando a modalidade for Concurso. Obrigatório para os demais casos.
     */
    @Column
    public int codNaturezaObjeto;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * Informar o ID do edital ou convite digitalizado e previamente enviado via endpoint próprio (Inclusive os Anexos)
     */
    @Column
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * Conforme tabela Tipo de envio de registro. Os tipos "atualização" e "correção" exigem que seja informado na URL o ID do registro enviado com tipo "inicial", utilizando o método PUT
     */
    @Column
    public int codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * Deve ser preenchido obrigatoriamente caso o codTipoEnvio seja igual a "atualização" ou "correção". Não preencher caso seja envio inicial.
     */
    @Column
    public String motivoAtualizacaoCorrecao;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * Informar o ID da Unidade Gestora conforme cadastro no Sistema Passaporte do TCMGO
     */
    @Column
    public Integer idUnidadeGestora;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * Texto Descritivo. Deve ser preenchido obrigatoriamente e somente quando Natureza do Objeto = Outros.
     */
    @Column
    public String descricaoNaturezaObjetoOutros;
    /**
     * Trata-se de prestação de serviço a ser executado de forma contínua.
     * (Required)
     * 
     */
    @Column
    public Boolean servicoContinuo;
    /**
     * Descreve o prêmio ou a remuneração do vencedor do Concurso.
     * Preencher somente e obrigatoriamente se Modalidade = Concurso.
     * 
     */
    @Column
    public String descricaoPremioOuRemuneracaoConcurso;
    /**
     * 
     * (Required)
     * 
     */
    @OneToMany(
            mappedBy = "licitacaoFaseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<LoteFaseUm> lote = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @OneToMany(
            mappedBy = "licitacaoFaseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<Responsavel> responsaveis = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @OneToMany(
            mappedBy = "licitacaoFaseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<ParecerFaseUm> parecerFaseUm = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @OneToMany(
            mappedBy = "licitacaoFaseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<Comissao> comissao = new HashSet<>();

    @OneToMany(
            mappedBy = "licitacaoFaseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<RecursoOrcamentario> recursoOrcamentario = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @OneToMany(
            mappedBy = "licitacaoFaseUm",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Set<Publicacao> publicacao = new HashSet<>();

}
