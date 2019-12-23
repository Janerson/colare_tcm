
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.regulamentacao_procedimentos_licitatorio;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * regulamentacaoDosProcedimentosLicitatorios
 * <p>
 * Informações sobre a regulamentação municipal do pregão, registro de preços e LC 123/06
 * 
 */
public class Regulamentacao {

    /**
     * Tipo de regulamentação
     * (Required)
     * 
     */
    @NotNull
    public Regulamentacao.CodTipoRegulamentacao codTipoRegulamentacao;
    /**
     * Informa a existência ou não de regulamentação municipal
     * (Required)
     * 
     */
    @NotNull
    public Boolean existeRegulamentacaoMunicipal;
    /**
     * Número do Decreto Municipal Regulamentador do Pregão, Registro de Preços ou da LC 123-06
     * 
     */
    public String numeroDecretoMunicipal;
    /**
     * Data do Decreto Municipal
     * 
     */
    public String dataDecretoMunicipal;
    /**
     * Data da Publicação
     * 
     */
    public String dataPublicacao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public Regulamentacao.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * detalhamentoLc123
     * <p>
     * Detalhamento da regulamentação do Artigo 47 da Lei Complementar 123/06
     * 
     */
    @Valid
    public DetalhamentoLc123 detalhamentoLc123;

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

    public enum CodTipoRegulamentacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoRegulamentacao> CONSTANTS = new HashMap<Integer, CodTipoRegulamentacao>();

        static {
            for (CodTipoRegulamentacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoRegulamentacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoRegulamentacao fromValue(Integer value) {
            CodTipoRegulamentacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
