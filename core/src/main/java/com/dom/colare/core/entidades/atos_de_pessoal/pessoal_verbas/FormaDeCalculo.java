
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * formaDeCalculo
 * <p>
 * Informar a Forma De Calculo
 * 
 */
public class FormaDeCalculo {

    /**
     * Tipo de Calculo
     * (Required)
     * 
     */
    @NotNull
    private FormaDeCalculo.TipoCalculo tipoCalculo;
    /**
     * Valor ou Percentual
     * (Required)
     * 
     */
    @NotNull
    private Double valorOuPercentual;
    /**
     * Tipo de Base de Calculo
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private FormaDeCalculo.TipoBaseDeCalculo tipoBaseDeCalculo;
    /**
     * Detalhe Base de Calculo
     * (Required)
     * 
     */
    @NotNull
    private Double baseDeCalculoDetalhe;
    @Valid
    private Set<DetalhamentoTipoCalculoCondicional> detalhamentoTipoCalculoCondicional = null;

    /**
     * Tipo de Calculo
     * (Required)
     * 
     */
    public TipoCalculo getTipoCalculo() {
        return tipoCalculo;
    }

    /**
     * Tipo de Calculo
     * (Required)
     * 
     */
    public void setTipoCalculo(TipoCalculo tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    /**
     * Valor ou Percentual
     * (Required)
     * 
     */
    public Double getValorOuPercentual() {
        return valorOuPercentual;
    }

    /**
     * Valor ou Percentual
     * (Required)
     * 
     */
    public void setValorOuPercentual(Double valorOuPercentual) {
        this.valorOuPercentual = valorOuPercentual;
    }

    /**
     * Tipo de Base de Calculo
     * (Required)
     * 
     */
    public TipoBaseDeCalculo getTipoBaseDeCalculo() {
        return tipoBaseDeCalculo;
    }

    /**
     * Tipo de Base de Calculo
     * (Required)
     * 
     */
    public void setTipoBaseDeCalculo(TipoBaseDeCalculo tipoBaseDeCalculo) {
        this.tipoBaseDeCalculo = tipoBaseDeCalculo;
    }

    /**
     * Detalhe Base de Calculo
     * (Required)
     * 
     */
    public Double getBaseDeCalculoDetalhe() {
        return baseDeCalculoDetalhe;
    }

    /**
     * Detalhe Base de Calculo
     * (Required)
     * 
     */
    public void setBaseDeCalculoDetalhe(Double baseDeCalculoDetalhe) {
        this.baseDeCalculoDetalhe = baseDeCalculoDetalhe;
    }

    public Set<DetalhamentoTipoCalculoCondicional> getDetalhamentoTipoCalculoCondicional() {
        return detalhamentoTipoCalculoCondicional;
    }

    public void setDetalhamentoTipoCalculoCondicional(Set<DetalhamentoTipoCalculoCondicional> detalhamentoTipoCalculoCondicional) {
        this.detalhamentoTipoCalculoCondicional = detalhamentoTipoCalculoCondicional;
    }

    public enum TipoBaseDeCalculo {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, TipoBaseDeCalculo> CONSTANTS = new HashMap<Integer, TipoBaseDeCalculo>();

        static {
            for (TipoBaseDeCalculo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoBaseDeCalculo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoBaseDeCalculo fromValue(Integer value) {
            TipoBaseDeCalculo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum TipoCalculo {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, TipoCalculo> CONSTANTS = new HashMap<Integer, TipoCalculo>();

        static {
            for (TipoCalculo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoCalculo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoCalculo fromValue(Integer value) {
            TipoCalculo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
