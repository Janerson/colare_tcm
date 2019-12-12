
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
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
     * (Required)
     * 
     */
    public Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     * 
     */
    public Integer numeroLicitacao;
    /**
     * Data prevista para a sessão de recebimento da documentação
     * (Required)
     * 
     */
    public String dataPrevistaAberturaSessao;
    /**
     * Objeto
     * (Required)
     * 
     */
    public String objeto;
    /**
     * Número de convidados.
     * 
     */
    public Integer numeroDeConvidados;
    /**
     * Licitação com preferência para ME e EPP (Art. 44, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    public Boolean criterioDesempateMEEPP;
    /**
     * Destinação exclusiva a ME e EPP (Art. 48, I, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    public Boolean destinacaoExclusivaMEEPP;
    /**
     * Exigência de subcontratação de ME e EPP (Art. 48, II, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    public Boolean subcontratacaoMEEPP;
    /**
     * Estabeleceu limite percentual do objeto para a contratação de ME e EPP? (Art. 48, III, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    public Boolean limitePercObjetoContratacaoMEEPP;
    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    public int codModalidadeLicitacao;
    /**
     * Natureza do Procedimento
     * (Required)
     * 
     */
    public int codNaturezaProcedimento;
    /**
     * Tipo de licitação
     * 
     */
    public int codTipoLicitacaoCriterioJulgamento;
    /**
     * Regime de execução
     * 
     */
    public int codRegimeExecucao;
    /**
     * Processo realizado por lote
     * (Required)
     * 
     */
    public Boolean processoPorLote;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    public String numeroProcessoAdministrativo;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    public int codNaturezaObjeto;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public int codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public Integer idUnidadeGestora;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    public String descricaoNaturezaObjetoOutros;
    /**
     * Trata-se de prestação de serviço a ser executado de forma contínua.
     * (Required)
     * 
     */
    public Boolean servicoContinuo;
    /**
     * Descreve o prêmio ou a remuneração do vencedor do Concurso.
     * 
     */
    public String descricaoPremioOuRemuneracaoConcurso;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Lote> lote = null;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Responsavel> responsaveis = null;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Parecer> parecer = null;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Comissao> comissao = null;

    public Set<RecursoOrcamentario> recursoOrcamentario = null;
    /**
     * 
     * (Required)
     * 
     */
    public Set<Publicacao> publicacao = null;

}
