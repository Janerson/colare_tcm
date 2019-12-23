
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * contratoInicial
 * <p>
 * Dados do contrato
 * 
 */
public class ContratoInicial {

    /**
     * Tipo do procedimento
     * (Required)
     * 
     */
    @NotNull
    public ContratoInicial.CodTipoProcedimento codTipoProcedimento;
    /**
     * ID do procedimento do qual decorre o contrato
     * (Required)
     * 
     */
    @NotNull
    public Integer idProcedimento;
    /**
     * Número do contrato
     * 
     */
    public String numeroContrato;
    /**
     * Ano do contrato
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    public Integer anoContrato;
    /**
     * Data da firmatura do documento
     * 
     */
    public String dataFirmatura;
    /**
     * Data do início da vigência
     * 
     */
    public String inicioVigencia;
    /**
     * Data do fim da vigência
     * 
     */
    public String fimVigencia;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    public ContratoInicial.CodNaturezaObjeto codNaturezaObjeto;
    /**
     * Objeto
     * (Required)
     * 
     */
    @NotNull
    public String objeto;
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
    public ContratoInicial.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Tipo de formalização do contrato
     * (Required)
     * 
     */
    @NotNull
    public ContratoInicial.CodTipoFormalizacaoContrato codTipoFormalizacaoContrato;
    /**
     * Descrição da forma de pagamento
     * (Required)
     * 
     */
    @NotNull
    public String formaPagamento;
    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    @NotNull
    public ContratoInicial.CodUnidadeMedidaPrazoExecucao codUnidadeMedidaPrazoExecucao;
    /**
     * Prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer prazoExecucao;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    public String descricaoNaturezaObjetoOutros;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Publicacao> publicacao = null;
    /**
     * contratado
     * <p>
     * Dados do contratado
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Contratado contratado;
    @Valid
    public Set<Empenho> empenho = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Responsavei> responsaveis = null;
    /**
     * procedimentoDeContratacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idProcedimento for igual a "-1", com os dados do Procedimento de contratação (Licitação, Dispensa/Inexigibilidade ou Adesão a Registro de Preços).
     * 
     */
    @Valid
    public ProcedimentoDeContratacao procedimentoDeContratacao;

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

    public enum CodTipoFormalizacaoContrato {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, CodTipoFormalizacaoContrato> CONSTANTS = new HashMap<Integer, CodTipoFormalizacaoContrato>();

        static {
            for (CodTipoFormalizacaoContrato c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoFormalizacaoContrato(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoFormalizacaoContrato fromValue(Integer value) {
            CodTipoFormalizacaoContrato constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoProcedimento {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoProcedimento> CONSTANTS = new HashMap<Integer, CodTipoProcedimento>();

        static {
            for (CodTipoProcedimento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoProcedimento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoProcedimento fromValue(Integer value) {
            CodTipoProcedimento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodUnidadeMedidaPrazoExecucao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodUnidadeMedidaPrazoExecucao> CONSTANTS = new HashMap<Integer, CodUnidadeMedidaPrazoExecucao>();

        static {
            for (CodUnidadeMedidaPrazoExecucao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodUnidadeMedidaPrazoExecucao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodUnidadeMedidaPrazoExecucao fromValue(Integer value) {
            CodUnidadeMedidaPrazoExecucao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
