
package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * parecer
 * <p>
 * Parecer da Licitação
 * 
 */
@Entity
@Data
public class Parecer extends BaseEntityID {

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
     * (Required)
     * 
     */
    @NotNull
    public String numeroRegistroOrgaoDeClasse;
    /**
     * Código IBGE do Estado onde foi realizado o registro no órgão de classe
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer codUfRegistroOrgaoDeClasse;

    public enum CodTipoParecer {

        _1(1),
        _2(2);
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
