
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_disposicao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalVidaFuncionalDisposicao
 * <p>
 * Dados de Disposição (Movimentação Externa)
 * 
 */
public class PessoalVidaFuncionalDisposicao {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalDisposicao.CodTipoEnvio codTipoEnvio;
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
     * Informa o tipo de disposição
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalDisposicao.CodTipoDisposicao codTipoDisposicao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * destino
     * <p>
     * Informar o destino da disposição
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Destino destino;

    public enum CodTipoDisposicao {

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
        private final static Map<Integer, CodTipoDisposicao> CONSTANTS = new HashMap<Integer, CodTipoDisposicao>();

        static {
            for (CodTipoDisposicao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDisposicao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDisposicao fromValue(Integer value) {
            CodTipoDisposicao constant = CONSTANTS.get(value);
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

}
