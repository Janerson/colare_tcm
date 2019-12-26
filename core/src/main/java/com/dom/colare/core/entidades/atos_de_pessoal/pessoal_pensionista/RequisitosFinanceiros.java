
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * requisitosFinanceiros
 * <p>
 * Contém os dados dos proventos do pensionista.
 * 
 */
public class RequisitosFinanceiros {

    /**
     * Informa qual foi a fixação dos proventos de pensão, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public RequisitosFinanceiros.TipoFixacaoProventosPensao tipoFixacaoProventosPensao;
    /**
     * Informa o valor total dos proventos, que o pensionista receberá.
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorTotalProventos;
    /**
     * Informar o valor do redutor, para provento superiores ao teto RGPS
     * 
     */
    @DecimalMin("0")
    public Double valorRedutorProvento;
    /**
     * Informa o percentual da utilizado para aplicação redutor.
     * 
     */
    @DecimalMin("0")
    public Double percentualRedutor;
    @Valid
    public Set<ComposicaoUltimaRemuneracao> composicaoUltimaRemuneracao = null;

    public enum TipoFixacaoProventosPensao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, TipoFixacaoProventosPensao> CONSTANTS = new HashMap<Integer, TipoFixacaoProventosPensao>();

        static {
            for (TipoFixacaoProventosPensao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoFixacaoProventosPensao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoFixacaoProventosPensao fromValue(Integer value) {
            TipoFixacaoProventosPensao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
