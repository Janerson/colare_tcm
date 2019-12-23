
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * parecer
 * <p>
 * Parecer da Licitação
 * 
 */
public class Parecer {

    /**
     * Data do parecer
     * (Required)
     * 
     */
    @NotNull
    public String dataParecer;
    /**
     * Código do Tipo do parecer
     * (Required)
     * 
     */
    @NotNull
    public Parecer.CodTipoParecer codTipoParecer;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;
    /**
     * Número do registro no órgão de classe
     * 
     */
    public String numeroRegistroOrgaoDeClasse;
    /**
     * Código IBGE do Estado onde foi realizado o registro no órgão de classe
     * 
     */
    public Integer codUfRegistroOrgaoDeClasse;

    public enum CodTipoParecer {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoParecer> CONSTANTS = new HashMap<Integer, CodTipoParecer>();

        static {
            for (CodTipoParecer c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoParecer(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoParecer fromValue(Integer value) {
            CodTipoParecer constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
