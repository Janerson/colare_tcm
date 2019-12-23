
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * quadroSocietario
 * <p>
 * Composição do Quadro Societário
 * 
 */
public class QuadroSocietario {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    public QuadroSocietario.CodTipoDocumento codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    public String numeroDocumento;
    /**
     * Código do tipo de Participação do Sócio
     * (Required)
     * 
     */
    @NotNull
    public QuadroSocietario.CodTipoParticipacao codTipoParticipacao;

    public enum CodTipoDocumento {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoDocumento> CONSTANTS = new HashMap<Integer, CodTipoDocumento>();

        static {
            for (CodTipoDocumento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDocumento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDocumento fromValue(Integer value) {
            CodTipoDocumento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoParticipacao {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoParticipacao> CONSTANTS = new HashMap<Integer, CodTipoParticipacao>();

        static {
            for (CodTipoParticipacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoParticipacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoParticipacao fromValue(Integer value) {
            CodTipoParticipacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
