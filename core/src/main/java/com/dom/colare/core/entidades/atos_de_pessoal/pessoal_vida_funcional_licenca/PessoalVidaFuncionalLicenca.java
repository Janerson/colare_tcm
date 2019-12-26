
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_licenca;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * pessoalVidaFuncionalLicenca
 * <p>
 * Dados de Licença
 * 
 */
public class PessoalVidaFuncionalLicenca {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalLicenca.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * ID da Admissão Previamente Informada
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalAdmissao;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    public String dataInicio;
    /**
     * Data fim
     * (Required)
     * 
     */
    @NotNull
    public String dataFinal;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * Informa o tipo de licença, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalLicenca.CodTipoLicenca codTipoLicenca;

    public enum CodTipoEnvio {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoEnvio> CONSTANTS = new HashMap<Integer, CodTipoEnvio>();

        static {
            for (CodTipoEnvio c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnvio(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnvio fromValue(Integer value) {
            CodTipoEnvio constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoLicenca {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9);
        private final Integer value;
        private final static Map<Integer, CodTipoLicenca> CONSTANTS = new HashMap<Integer, CodTipoLicenca>();

        static {
            for (CodTipoLicenca c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoLicenca(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoLicenca fromValue(Integer value) {
            CodTipoLicenca constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
