
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * pensaoJudicial
 * <p>
 * Contém os dados das Pensões Judiciais.
 * 
 */
public class PensaoJudicial {

    /**
     * Informa o detalhamento da peça Decisão Judicial, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public PensaoJudicial.DetalhamentoPecaJudicial detalhamentoPecaJudicial;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum DetalhamentoPecaJudicial {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, DetalhamentoPecaJudicial> CONSTANTS = new HashMap<Integer, DetalhamentoPecaJudicial>();

        static {
            for (DetalhamentoPecaJudicial c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DetalhamentoPecaJudicial(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static DetalhamentoPecaJudicial fromValue(Integer value) {
            DetalhamentoPecaJudicial constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
