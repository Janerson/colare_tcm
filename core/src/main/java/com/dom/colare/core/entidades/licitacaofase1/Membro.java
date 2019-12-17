
package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * membro
 * <p>
 * Membros da comissão de licitação
 * 
 */
@Entity
@Data
public class Membro extends BaseEntityID {

    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;
    /**
     * Código da atribuição do responsável pela licitação.
     * (Required)
     * 
     */
    @NotNull
    public Membro.CodAtribuicao codAtribuicao;
    /**
     * Natureza do Cargo
     * (Required)
     * 
     */
    @NotNull
    public Membro.CodNaturezaCargo codNaturezaCargo;

    public enum CodAtribuicao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6);
        private final Integer value;
        private final static Map<Integer, CodAtribuicao> CONSTANTS = new HashMap<Integer, CodAtribuicao>();

        static {
            for (CodAtribuicao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodAtribuicao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodAtribuicao fromValue(Integer value) {
            CodAtribuicao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodNaturezaCargo {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6);
        private final Integer value;
        private final static Map<Integer, CodNaturezaCargo> CONSTANTS = new HashMap<Integer, CodNaturezaCargo>();

        static {
            for (CodNaturezaCargo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodNaturezaCargo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodNaturezaCargo fromValue(Integer value) {
            CodNaturezaCargo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
