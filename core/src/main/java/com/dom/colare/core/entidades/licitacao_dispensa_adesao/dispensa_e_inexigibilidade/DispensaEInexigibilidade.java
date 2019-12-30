
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * dispensaEInexigibilidade
 * <p>
 * Dispensas e inexigibilidades de procedimentos licitatórios
 * 
 */
public class DispensaEInexigibilidade {

    /**
     * Exercício do Processo de Dispensa
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    public Integer exercicioProcesso;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    public String numeroProcessoAdministrativo;
    /**
     * Tipo do processo de Dispensa
     * (Required)
     * 
     */
    @NotNull
    public DispensaEInexigibilidade.CodTipoProcesso codTipoProcesso;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    public DispensaEInexigibilidade.CodNaturezaObjeto codNaturezaObjeto;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public DispensaEInexigibilidade.CodTipoEnvio codTipoEnvio;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    public String idDocumentoPDF;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * ID da remessa de Licitação-Fase2 fracassada
     * 
     */
    @DecimalMin("1")
    public Integer idFase2DesertaFracassada;
    /**
     * Data de início do processo de dispensa
     * (Required)
     * 
     */
    @NotNull
    public String dataInicioProcessoDispensa;
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
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
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
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ItemDispensa> item = null;
    @Valid
    public Set<FornecedorContratado> fornecedorContratado = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Responsavel> responsaveis = null;
    @Valid
    public Set<RecursoOrcamentarioDispensa> recursoOrcamentarioDispensa = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ParecerDispensa> parecerDispensa = null;

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

    public enum CodTipoProcesso {

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
        _101(101),
        _102(102),
        _103(103),
        _104(104),
        _105(105),
        _106(106),
        _107(107),
        _108(108),
        _109(109),
        _110(110),
        _111(111),
        _112(112),
        _113(113),
        _114(114),
        _115(115),
        _116(116),
        _117(117),
        _118(118),
        _100(100);
        private final Integer value;
        private final static Map<Integer, CodTipoProcesso> CONSTANTS = new HashMap<Integer, CodTipoProcesso>();

        static {
            for (CodTipoProcesso c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoProcesso(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoProcesso fromValue(Integer value) {
            CodTipoProcesso constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
