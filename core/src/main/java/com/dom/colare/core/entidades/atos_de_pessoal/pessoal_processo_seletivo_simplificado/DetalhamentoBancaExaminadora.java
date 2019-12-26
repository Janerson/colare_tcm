
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoBancaExaminadora
 * <p>
 * Informa Detalhamento Banca Examinadora
 * 
 */
public class DetalhamentoBancaExaminadora {

    /**
     * Código do tipo de Banca Examinadora
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoBancaExaminadora.CodTipoBancaExaminadora codTipoBancaExaminadora;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * ID do contrato original previamente informado.
     * 
     */
    public Integer idContratoOriginal;

    public enum CodTipoBancaExaminadora {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoBancaExaminadora> CONSTANTS = new HashMap<Integer, CodTipoBancaExaminadora>();

        static {
            for (CodTipoBancaExaminadora c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoBancaExaminadora(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoBancaExaminadora fromValue(Integer value) {
            CodTipoBancaExaminadora constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
