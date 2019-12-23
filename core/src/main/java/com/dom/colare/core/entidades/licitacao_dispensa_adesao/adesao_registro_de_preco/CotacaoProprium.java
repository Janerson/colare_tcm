
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * cotacaoPropria
 * <p>
 * Dados da cotação de preços para a adesão
 * 
 */
public class CotacaoProprium {

    /**
     * Identifica o tipo do documento
     * 
     */
    public CodTipoDocumento codTipoDocumento;
    /**
     * Número do documento
     * 
     */
    public String numeroDocumento;
    /**
     * Data da cotação
     * (Required)
     * 
     */
    @NotNull
    public String dataCotacao;
    /**
     * Valor Unitário
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorUnitario;
    /**
     * Quantidade
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double quantidade;
    /**
     * Código da origem do valor de referência
     * (Required)
     * 
     */
    @NotNull
    public CotacaoProprium.CodOrigemValorReferencia codOrigemValorReferencia;
    /**
     * Descreve onde foi obtido o valor de referência.
     * 
     */
    public String descricaoOrigemValorReferencia;

    public enum CodOrigemValorReferencia {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _9999(9999),
        _8(8);
        private final Integer value;
        private final static Map<Integer, CodOrigemValorReferencia> CONSTANTS = new HashMap<Integer, CodOrigemValorReferencia>();

        static {
            for (CodOrigemValorReferencia c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodOrigemValorReferencia(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodOrigemValorReferencia fromValue(Integer value) {
            CodOrigemValorReferencia constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoDocumento {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoDocumento> CONSTANTS = new HashMap<Integer, CodTipoDocumento>();

        static {
            for (CodTipoDocumento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDocumento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDocumento fromValue(Integer value) {
            CodTipoDocumento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
