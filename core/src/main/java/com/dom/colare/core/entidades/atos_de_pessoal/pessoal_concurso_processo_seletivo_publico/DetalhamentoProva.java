
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoProva
 * <p>
 * Informar o detalhamento das provas vinculadas ao cargos da seleção.
 * 
 */
public class DetalhamentoProva {

    /**
     * Data da realização da prova
     * (Required)
     * 
     */
    @NotNull
    public String dataRealizacaoProva;
    /**
     * Tipo de prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoProva.CodTipoProva codTipoProva;
    /**
     * caraterdaprova
     * <p>
     * Informar detalhes sobre o caráter da prova e clausulas sobre pontuação da prova. 
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Caraterdaprova caraterdaprova;

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

}
