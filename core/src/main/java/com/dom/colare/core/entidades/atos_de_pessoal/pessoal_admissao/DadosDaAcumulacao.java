
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * dadosDaAcumulacao
 * <p>
 * Informar dados de acumulação
 * 
 */
public class DadosDaAcumulacao {

    /**
     * Informa qual a esfera a qual o servidor acumula cargo.
     * (Required)
     * 
     */
    @NotNull
    private DadosDaAcumulacao.CodEsferaAcumulacao codEsferaAcumulacao;
    /**
     * Informa o código do IBGE
     * (Required)
     * 
     */
    @NotNull
    private String codIBGEDoEnteOndeHaAcumulacao;
    /**
     * municipioGoiano
     * <p>
     * Informar os dados do município goiano quando a acumulação de cargo for na esfera municipal.
     * 
     */
    @Valid
    private MunicipioGoiano municipioGoiano;

    /**
     * Informa qual a esfera a qual o servidor acumula cargo.
     * (Required)
     * 
     */
    public CodEsferaAcumulacao getCodEsferaAcumulacao() {
        return codEsferaAcumulacao;
    }

    /**
     * Informa qual a esfera a qual o servidor acumula cargo.
     * (Required)
     * 
     */
    public void setCodEsferaAcumulacao(CodEsferaAcumulacao codEsferaAcumulacao) {
        this.codEsferaAcumulacao = codEsferaAcumulacao;
    }

    /**
     * Informa o código do IBGE
     * (Required)
     * 
     */
    public String getCodIBGEDoEnteOndeHaAcumulacao() {
        return codIBGEDoEnteOndeHaAcumulacao;
    }

    /**
     * Informa o código do IBGE
     * (Required)
     * 
     */
    public void setCodIBGEDoEnteOndeHaAcumulacao(String codIBGEDoEnteOndeHaAcumulacao) {
        this.codIBGEDoEnteOndeHaAcumulacao = codIBGEDoEnteOndeHaAcumulacao;
    }

    /**
     * municipioGoiano
     * <p>
     * Informar os dados do município goiano quando a acumulação de cargo for na esfera municipal.
     * 
     */
    public MunicipioGoiano getMunicipioGoiano() {
        return municipioGoiano;
    }

    /**
     * municipioGoiano
     * <p>
     * Informar os dados do município goiano quando a acumulação de cargo for na esfera municipal.
     * 
     */
    public void setMunicipioGoiano(MunicipioGoiano municipioGoiano) {
        this.municipioGoiano = municipioGoiano;
    }

    public enum CodEsferaAcumulacao {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodEsferaAcumulacao> CONSTANTS = new HashMap<Integer, CodEsferaAcumulacao>();

        static {
            for (CodEsferaAcumulacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodEsferaAcumulacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodEsferaAcumulacao fromValue(Integer value) {
            CodEsferaAcumulacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
