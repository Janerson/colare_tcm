
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * atasLicitacao
 * <p>
 * Dados da(s) ata(s) da(s) sessão(ões)
 * 
 */
public class AtasLicitacao {

    /**
     * Código do tipo de ata.
     * (Required)
     * 
     */
    @NotNull
    public AtasLicitacao.CodTipoAta codTipoAta;
    /**
     * Data do evento
     * (Required)
     * 
     */
    @NotNull
    public String data;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum CodTipoAta {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, CodTipoAta> CONSTANTS = new HashMap<Integer, CodTipoAta>();

        static {
            for (CodTipoAta c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoAta(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoAta fromValue(Integer value) {
            CodTipoAta constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
