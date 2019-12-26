
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoProva
 * <p>
 * Informa o Detalhamento da Prova
 * 
 */
public class DetalhamentoProva {

    /**
     * Tipo de prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoProva.CodTipoProva codTipoProva;
    /**
     * Caráter da prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoProva.TipoCaraterProva tipoCaraterProva;
    /**
     * Data da realização da prova
     * (Required)
     * 
     */
    @NotNull
    public String dataRealizacaoProva;

    public enum CodTipoProva {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9);
        private final Integer value;
        private final static Map<Integer, CodTipoProva> CONSTANTS = new HashMap<Integer, CodTipoProva>();

        static {
            for (CodTipoProva c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoProva(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoProva fromValue(Integer value) {
            CodTipoProva constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum TipoCaraterProva {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, TipoCaraterProva> CONSTANTS = new HashMap<Integer, TipoCaraterProva>();

        static {
            for (TipoCaraterProva c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoCaraterProva(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoCaraterProva fromValue(Integer value) {
            TipoCaraterProva constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
