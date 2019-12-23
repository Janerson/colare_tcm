
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * dispensaEInexigibilidade
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "2-Dispensa", com os dados da dispensa/inexigibilidade da qual resultou o contrato.
 * 
 */
public class DispensaEInexigibilidade {

    /**
     * Tipo do processo de Dispensa
     * (Required)
     * 
     */
    @NotNull
    public DispensaEInexigibilidade.CodTipoProcesso codTipoProcesso;
    /**
     * Exercício do Processo de Dispensa
     * (Required)
     * 
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    public Integer exercicioProcesso;
    @Valid
    public Set<EditalEAnexo_> editalEAnexos = null;

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
