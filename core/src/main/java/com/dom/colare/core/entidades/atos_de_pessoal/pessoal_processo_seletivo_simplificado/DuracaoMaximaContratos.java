
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * duracaoMaximaContratos
 * <p>
 * Informa a Duracao Maxima dos Contratos
 * 
 */
public class DuracaoMaximaContratos {

    /**
     * Tipo de prazo
     * (Required)
     * 
     */
    @NotNull
    public DuracaoMaximaContratos.TipoPrazo tipoPrazo;
    /**
     * Prazo de Duração
     * (Required)
     * 
     */
    @NotNull
    public Integer prazoDeDuracao;
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

    public enum TipoPrazo {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, TipoPrazo> CONSTANTS = new HashMap<Integer, TipoPrazo>();

        static {
            for (TipoPrazo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoPrazo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoPrazo fromValue(Integer value) {
            TipoPrazo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
