
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * contratado
 * <p>
 * Dados do contratado
 * 
 */
public class Contratado {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    public Contratado.CodTipoDocumento codTipoDocumento;
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
     * Número da Certidão de Regularidade do INSS
     * 
     */
    public String numeroCertidaoRegularidadeINSS;
    /**
     * Número da Certidão de Regularidade do FGTS
     * 
     */
    public String numeroCertidaoRegularidadeFGTS;
    /**
     * Número da Certidão negativa de Débitos Trabalhistas
     * 
     */
    public String numeroCNDT;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    public String idDocumentoPDF;
    /**
     * Número de inscrição no CREA/CAU
     * 
     */
    public String numeroInscricaoCREA_CAU;
    /**
     * Código IBGE da unidade onde foi realizada a inscrição
     * 
     */
    public String codIbgeUFInscricaoCREA_CAU;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<PrecoContratado> precoContratado = null;
    @Valid
    public Set<QuadroSocietario> quadroSocietario = null;

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
