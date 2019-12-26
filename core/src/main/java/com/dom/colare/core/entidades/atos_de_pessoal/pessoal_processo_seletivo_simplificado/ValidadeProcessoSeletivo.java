
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * validadeProcessoSeletivo
 * <p>
 * Informa Validade Processo Seletivo
 * 
 */
public class ValidadeProcessoSeletivo {

    /**
     * Tipo de validade, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    public ValidadeProcessoSeletivo.TipoValidade tipoValidade;
    /**
     * Quantidade prazo validade
     * (Required)
     * 
     */
    @NotNull
    public Integer prazoDeValidade;
    /**
     * É prevista a prorrogação
     * (Required)
     * 
     */
    @NotNull
    public Boolean ehProrrogavel;
    /**
     * Número do Item do Edital
     * (Required)
     * 
     */
    @NotNull
    public String numeroItemDoEdital;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;

    public enum TipoValidade {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, TipoValidade> CONSTANTS = new HashMap<Integer, TipoValidade>();

        static {
            for (TipoValidade c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoValidade(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoValidade fromValue(Integer value) {
            TipoValidade constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}