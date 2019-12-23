
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.situacao_procedimento;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * situacaoProcedimento
 * <p>
 * Dados da situação do procedimento - Incidentes
 * 
 */
public class SituacaoProcedimento {

    /**
     * Identifica o fato em que ocorreu o incidente
     * (Required)
     * 
     */
    @NotNull
    public SituacaoProcedimento.CodTipoProcedimentoOuContrato codTipoProcedimentoOuContrato;
    /**
     * ID do procedimento de compra ou alienação ou o contrato previamente informado
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer idProcedimentoOuContrato;
    /**
     * Tipo de situação
     * (Required)
     * 
     */
    @NotNull
    public SituacaoProcedimento.TipoDeSituacao tipoDeSituacao;
    /**
     * Número do Processo no TCMGO
     * 
     */
    public String numeroProcessoTCM;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public SituacaoProcedimento.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Data do evento
     * 
     */
    public String data;

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

    public enum CodTipoProcedimentoOuContrato {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoProcedimentoOuContrato> CONSTANTS = new HashMap<Integer, CodTipoProcedimentoOuContrato>();

        static {
            for (CodTipoProcedimentoOuContrato c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoProcedimentoOuContrato(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoProcedimentoOuContrato fromValue(Integer value) {
            CodTipoProcedimentoOuContrato constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum TipoDeSituacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _1999(1999);
        private final Integer value;
        private final static Map<Integer, TipoDeSituacao> CONSTANTS = new HashMap<Integer, TipoDeSituacao>();

        static {
            for (TipoDeSituacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoDeSituacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoDeSituacao fromValue(Integer value) {
            TipoDeSituacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
