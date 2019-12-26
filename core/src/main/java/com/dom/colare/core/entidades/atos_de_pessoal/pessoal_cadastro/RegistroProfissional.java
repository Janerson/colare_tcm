
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cadastro;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * registroProfissional
 * <p>
 * Informa Registro Profissional
 * 
 */
public class RegistroProfissional {

    /**
     * Código Conselho o Ordem, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private RegistroProfissional.CodConselhoOrdem codConselhoOrdem;
    /**
     * Número do Registro
     * (Required)
     * 
     */
    @NotNull
    private String numeroRegistro;

    /**
     * Código Conselho o Ordem, conforme tabela.
     * (Required)
     * 
     */
    public CodConselhoOrdem getCodConselhoOrdem() {
        return codConselhoOrdem;
    }

    /**
     * Código Conselho o Ordem, conforme tabela.
     * (Required)
     * 
     */
    public void setCodConselhoOrdem(CodConselhoOrdem codConselhoOrdem) {
        this.codConselhoOrdem = codConselhoOrdem;
    }

    /**
     * Número do Registro
     * (Required)
     * 
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Número do Registro
     * (Required)
     * 
     */
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public enum CodConselhoOrdem {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12),
        _13(13),
        _14(14),
        _15(15),
        _16(16),
        _17(17),
        _18(18),
        _19(19);
        private final Integer value;
        private final static Map<Integer, CodConselhoOrdem> CONSTANTS = new HashMap<Integer, CodConselhoOrdem>();

        static {
            for (CodConselhoOrdem c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodConselhoOrdem(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodConselhoOrdem fromValue(Integer value) {
            CodConselhoOrdem constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
