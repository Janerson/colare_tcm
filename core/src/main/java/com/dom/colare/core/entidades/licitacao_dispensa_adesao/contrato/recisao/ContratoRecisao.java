
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.recisao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * contratoRescisao
 * <p>
 * Dados da rescisão contratual.
 * 
 */
public class ContratoRecisao {

    /**
     * ID do contrato original previamente informado.
     * (Required)
     * 
     */
    @NotNull
    public Integer idContratoOriginal;
    /**
     * Motivo da rescisão
     * (Required)
     * 
     */
    @NotNull
    public ContratoRecisao.CodMotivoRescisao codMotivoRescisao;
    /**
     * Tipo da rescisão
     * (Required)
     * 
     */
    @NotNull
    public ContratoRecisao.CodTipoRescisao codTipoRescisao;
    /**
     * Data do evento
     * (Required)
     * 
     */
    @NotNull
    public String data;
    /**
     * Saldo final executado do contrato
     * 
     */
    @DecimalMin("0")
    public Double saldoFinalExecutadoContrato;
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
    public ContratoRecisao.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<PublicacaoRecisao> publicacaoRecisao = null;
    @Valid
    public Set<EmpenhoAnulado> empenhoAnulado = null;
    /**
     * contratoOriginal
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo rescindido.
     * 
     */
    @Valid
    public ContratoOriginal contratoOriginal;

    public enum CodMotivoRescisao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12),
        _13(13),
        _14(14),
        _15(15),
        _16(16),
        _17(17),
        _18(18);
        private final Integer value;
        private final static Map<Integer, CodMotivoRescisao> CONSTANTS = new HashMap<Integer, CodMotivoRescisao>();

        static {
            for (CodMotivoRescisao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodMotivoRescisao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodMotivoRescisao fromValue(Integer value) {
            CodMotivoRescisao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

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

    public enum CodTipoRescisao {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoRescisao> CONSTANTS = new HashMap<Integer, CodTipoRescisao>();

        static {
            for (CodTipoRescisao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoRescisao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoRescisao fromValue(Integer value) {
            CodTipoRescisao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
