
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * resultado
 * <p>
 * Dados do resultado (vencedor) da licitação (após negociação)
 * 
 */
public class Resultado {

    /**
     * Data da Adjudicação da Licitação
     * 
     */
    public String dataAdjudicacao;
    /**
     * Data da homologação
     * 
     */
    public String dataHomologacao;
    /**
     * Identifica o tipo do documento
     * 
     */
    public CodTipoDocumento codTipoDocumento;
    /**
     * Número do documento
     * 
     */
    public String numeroDocumento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<PrecoFinal> precoFinal = null;

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

}
