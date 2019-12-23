
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * licitacaoFase1
 * <p>
 * Envio inicial dos dados da licitação - Abertura da licitação
 * 
 */
@Entity
@Data
public class LicitacaoFaseUm extends BaseEntityID {

    /**
     * Exercício do edital da licitação
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    public Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull
    public Integer numeroLicitacao;
    /**
     * Data prevista para a sessão de recebimento da documentação
     * (Required)
     * 
     */
    @NotNull
    public String dataPrevistaAberturaSessao;
    /**
     * Objeto
     * (Required)
     * 
     */
    @NotNull
    public String objeto;
    /**
     * Número de convidados.
     * 
     */
    @DecimalMin("1")
    public Integer numeroDeConvidados;
    /**
     * Licitação com preferência para ME e EPP (Art. 44, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @NotNull
    public Boolean criterioDesempateMEEPP;
    /**
     * Destinação exclusiva a ME e EPP (Art. 48, I, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @NotNull
    public Boolean destinacaoExclusivaMEEPP;
    /**
     * Exigência de subcontratação de ME e EPP (Art. 48, II, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @NotNull
    public Boolean subcontratacaoMEEPP;
    /**
     * Estabeleceu limite percentual do objeto para a contratação de ME e EPP? (Art. 48, III, Lei Complementar 123/2006)
     * (Required)
     * 
     */
    @NotNull
    public Boolean limitePercObjetoContratacaoMEEPP;
    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    @NotNull
    public LicitacaoFaseUm.CodModalidadeLicitacao codModalidadeLicitacao;
    /**
     * Natureza do Procedimento
     * (Required)
     * 
     */
    @NotNull
    public LicitacaoFaseUm.CodNaturezaProcedimento codNaturezaProcedimento;
    /**
     * Tipo de licitação
     * 
     */
    public CodTipoLicitacaoCriterioJulgamento codTipoLicitacaoCriterioJulgamento;
    /**
     * Regime de execução
     * 
     */
    public CodRegimeExecucao codRegimeExecucao;
    /**
     * Processo realizado por lote
     * (Required)
     * 
     */
    @NotNull
    public Boolean processoPorLote;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    public String numeroProcessoAdministrativo;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    public LicitacaoFaseUm.CodNaturezaObjeto codNaturezaObjeto;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public LicitacaoFaseUm.CodTipoEnvio codTipoEnvio;
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
    @DecimalMin("1")
    @NotNull
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
    @NotNull
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
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Lote> lote = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Responsavel> responsaveis = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Parecer> parecer = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Comissao> comissao = null;
    @Valid
    public Set<RecursoOrcamentario> recursoOrcamentario = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Publicacao> publicacao = null;

    public enum CodModalidadeLicitacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8);
        private final Integer value;
        private final static Map<Integer, CodModalidadeLicitacao> CONSTANTS = new HashMap<Integer, CodModalidadeLicitacao>();

        static {
            for (CodModalidadeLicitacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodModalidadeLicitacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodModalidadeLicitacao fromValue(Integer value) {
            CodModalidadeLicitacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodNaturezaObjeto {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12),
        _13(13),
        _14(14),
        _15(15),
        _16(16),
        _17(17),
        _18(18),
        _19(19),
        _20(20),
        _21(21),
        _22(22),
        _23(23),
        _24(24),
        _25(25),
        _26(26),
        _27(27),
        _28(28),
        _29(29),
        _30(30),
        _31(31),
        _32(32),
        _33(33),
        _34(34),
        _35(35),
        _36(36),
        _37(37),
        _38(38),
        _39(39),
        _40(40),
        _41(41),
        _42(42),
        _43(43),
        _44(44),
        _45(45),
        _46(46),
        _47(47),
        _48(48),
        _9999(9999);
        private final Integer value;
        private final static Map<Integer, CodNaturezaObjeto> CONSTANTS = new HashMap<Integer, CodNaturezaObjeto>();

        static {
            for (CodNaturezaObjeto c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodNaturezaObjeto(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodNaturezaObjeto fromValue(Integer value) {
            CodNaturezaObjeto constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodNaturezaProcedimento {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodNaturezaProcedimento> CONSTANTS = new HashMap<Integer, CodNaturezaProcedimento>();

        static {
            for (CodNaturezaProcedimento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodNaturezaProcedimento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodNaturezaProcedimento fromValue(Integer value) {
            CodNaturezaProcedimento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodRegimeExecucao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, CodRegimeExecucao> CONSTANTS = new HashMap<Integer, CodRegimeExecucao>();

        static {
            for (CodRegimeExecucao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodRegimeExecucao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodRegimeExecucao fromValue(Integer value) {
            CodRegimeExecucao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoEnvio {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoEnvio> CONSTANTS = new HashMap<Integer, CodTipoEnvio>();

        static {
            for (CodTipoEnvio c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnvio(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnvio fromValue(Integer value) {
            CodTipoEnvio constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoLicitacaoCriterioJulgamento {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10);
        private final Integer value;
        private final static Map<Integer, CodTipoLicitacaoCriterioJulgamento> CONSTANTS = new HashMap<Integer, CodTipoLicitacaoCriterioJulgamento>();

        static {
            for (CodTipoLicitacaoCriterioJulgamento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoLicitacaoCriterioJulgamento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoLicitacaoCriterioJulgamento fromValue(Integer value) {
            CodTipoLicitacaoCriterioJulgamento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
