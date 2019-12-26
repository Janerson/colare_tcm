
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_dados_previdenciarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalDadosPrevidenciarios
 * <p>
 * Dados Previdenciários
 * 
 */
public class PessoalDadosPrevidenciarios {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalDadosPrevidenciarios.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    public String dataInicio;
    /**
     * dadosPrevidenciariosRpps
     * <p>
     * Informa os dados previdenciários do RPPS
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DadosPrevidenciariosRpps dadosPrevidenciariosRpps;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DadosRgpsUnidadesGestora> dadosRgpsUnidadesGestoras = null;

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

}
