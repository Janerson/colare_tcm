
package com.dom.colare.core.entidades.licitacaofase1;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * responsaveis
 * <p>
 * Detalhamento dos Responsáveis pela licitação
 * 
 */
public class Responsavel {

    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    @NotNull
    public Responsavel.CodTipoResponsabilidade codTipoResponsabilidade;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;

    public enum CodTipoResponsabilidade {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7);
        private final Integer value;
        private final static Map<Integer, CodTipoResponsabilidade> CONSTANTS = new HashMap<Integer, CodTipoResponsabilidade>();

        static {
            for (CodTipoResponsabilidade c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoResponsabilidade(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoResponsabilidade fromValue(Integer value) {
            CodTipoResponsabilidade constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
