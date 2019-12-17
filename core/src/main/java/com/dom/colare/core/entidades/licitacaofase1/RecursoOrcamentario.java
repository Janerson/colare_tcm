
package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.shared.BaseEntityID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * recursoOrcamentario
 * <p>
 * Detalhamento dos Recursos Orçamentários
 * 
 */
public class RecursoOrcamentario extends BaseEntityID {

    /**
     * Código da origem do recurso
     * (Required)
     * 
     */
    @NotNull
    public RecursoOrcamentario.CodOrigemRecurso codOrigemRecurso;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Dotacao> dotacao = null;

    public enum CodOrigemRecurso {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodOrigemRecurso> CONSTANTS = new HashMap<Integer, CodOrigemRecurso>();

        static {
            for (CodOrigemRecurso c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodOrigemRecurso(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodOrigemRecurso fromValue(Integer value) {
            CodOrigemRecurso constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
