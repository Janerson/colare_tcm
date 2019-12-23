
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * responsaveis
 * <p>
 * Responsáveis pelo contrato
 * 
 */
public class Responsavei {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;
    /**
     * Código do tipo de responsabilidade
     * (Required)
     * 
     */
    @NotNull
    public Responsavei.CodTipoResponsabilidade codTipoResponsabilidade;

    public enum CodTipoResponsabilidade {

        _1(1),
        _2(2),
        _3(3);
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
