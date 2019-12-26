
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cadastro;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoDeficiencia
 * <p>
 * Informa o detalhamento da deficiência.
 * 
 */
public class DetalhamentoDeficiencia {

    /**
     * CID PcD
     * (Required)
     * 
     */
    @NotNull
    private String cIDPcD;
    /**
     * Tipo de Deficiencia
     * (Required)
     * 
     */
    @NotNull
    private DetalhamentoDeficiencia.TipoDeficiencia tipoDeficiencia;

    /**
     * CID PcD
     * (Required)
     * 
     */
    public String getCIDPcD() {
        return cIDPcD;
    }

    /**
     * CID PcD
     * (Required)
     * 
     */
    public void setCIDPcD(String cIDPcD) {
        this.cIDPcD = cIDPcD;
    }

    /**
     * Tipo de Deficiencia
     * (Required)
     * 
     */
    public TipoDeficiencia getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    /**
     * Tipo de Deficiencia
     * (Required)
     * 
     */
    public void setTipoDeficiencia(TipoDeficiencia tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public enum TipoDeficiencia {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, TipoDeficiencia> CONSTANTS = new HashMap<Integer, TipoDeficiencia>();

        static {
            for (TipoDeficiencia c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoDeficiencia(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoDeficiencia fromValue(Integer value) {
            TipoDeficiencia constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
