
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * licitantes
 * <p>
 * Participantes habilitáveis
 * 
 */
public class Licitante {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    public Licitante.CodTipoDocumento codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    public String numeroDocumento;
    /**
     * Número de Inscrição Estadual
     * 
     */
    public String numeroInscricaoEstadual;
    /**
     * Código IBGE do Estado onde foi realizada a inscrição
     * 
     */
    public String codIbgeInscricaoEstadual;
    /**
     * Número de inscrição municipal
     * 
     */
    public String numeroInscricaoMunicipal;
    /**
     * Informa se se trata de uma S/A de Capital Aberto e com registro na CVM
     * (Required)
     * 
     */
    @NotNull
    public Boolean empresaDeCapitalAbertoCVM;
    @Valid
    public Set<QuadroSocietario> quadroSocietario = null;
    @Valid
    public Set<MapaDePreco> mapaDePrecos = null;
    /**
     * habilitacao
     * <p>
     * Habilitação do licitante
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Habilitacao habilitacao;
    /**
     * julgamento
     * <p>
     * Julgamento das propostas, por licitante
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Julgamento julgamento;

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
