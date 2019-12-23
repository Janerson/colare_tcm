
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * contratoOriginal
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
 * 
 */
public class ContratoOriginal {

    /**
     * Ano do contrato
     * (Required)
     * 
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    public Integer anoContrato;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    public ContratoOriginal.CodNaturezaObjeto codNaturezaObjeto;
    /**
     * Tipo do procedimento
     * (Required)
     * 
     */
    @NotNull
    public ContratoOriginal.CodTipoProcedimento codTipoProcedimento;
    /**
     * Data do fim da vigência
     * (Required)
     * 
     */
    @NotNull
    public String fimVigencia;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    @NotNull
    public String inicioVigencia;
    /**
     * Número do contrato
     * (Required)
     * 
     */
    @NotNull
    public String numeroContrato;
    /**
     * Objeto
     * (Required)
     * 
     */
    @NotNull
    public String objeto;
    /**
     * Valor do contrato
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorContrato;
    /**
     * licitacao
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original que está sendo rescindido.
     * 
     */
    @Valid
    public Licitacao licitacao;

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

}
