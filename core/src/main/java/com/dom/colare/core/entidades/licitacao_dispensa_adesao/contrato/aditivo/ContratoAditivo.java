
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * contratoAditivo
 * <p>
 * Dados do contrato aditivo
 * 
 */
public class ContratoAditivo {

    /**
     * ID do contrato original previamente informado.
     * (Required)
     * 
     */
    @NotNull
    public Integer idContratoOriginal;
    /**
     * Número do contrato
     * (Required)
     * 
     */
    @NotNull
    public String numeroContrato;
    /**
     * Ano do contrato
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    public Integer anoContrato;
    /**
     * Tipo de contrato aditivo
     * (Required)
     * 
     */
    @NotNull
    public ContratoAditivo.CodTipoAditivo codTipoAditivo;
    /**
     * Data da firmatura do documento
     * (Required)
     * 
     */
    @NotNull
    public String dataFirmatura;
    /**
     * Prazo a ser adicionado ao original
     * 
     */
    @DecimalMin("0")
    public Integer prazoAdicional;
    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * 
     */
    public CodUnidadeMedidaPrazoExecucao codUnidadeMedidaPrazoExecucao;
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
    public ContratoAditivo.CodTipoEnvio codTipoEnvio;
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
    public Set<PublicacaoAditivo> publicacaoAditivo = null;
    @Valid
    public Set<Empenho> empenho = null;
    /**
     * contratado
     * <p>
     * Dados do contratado
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Contratado contratado;
    /**
     * contratoOriginal
     * <p>
     * Preencher exclusivamente e obrigatoriamente quando idContratoOriginal for igual a -1, com os dados do contrato original que está sendo aditivado.
     * 
     */
    @Valid
    public ContratoOriginal contratoOriginal;

    public enum CodTipoAditivo {

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
        _11(11);
        private final Integer value;
        private final static Map<Integer, CodTipoAditivo> CONSTANTS = new HashMap<Integer, CodTipoAditivo>();

        static {
            for (CodTipoAditivo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoAditivo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoAditivo fromValue(Integer value) {
            CodTipoAditivo constant = CONSTANTS.get(value);
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

    public enum CodUnidadeMedidaPrazoExecucao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodUnidadeMedidaPrazoExecucao> CONSTANTS = new HashMap<Integer, CodUnidadeMedidaPrazoExecucao>();

        static {
            for (CodUnidadeMedidaPrazoExecucao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodUnidadeMedidaPrazoExecucao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodUnidadeMedidaPrazoExecucao fromValue(Integer value) {
            CodUnidadeMedidaPrazoExecucao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
