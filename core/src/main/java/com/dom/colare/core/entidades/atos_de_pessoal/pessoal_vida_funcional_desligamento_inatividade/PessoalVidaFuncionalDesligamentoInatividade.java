
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_desligamento_inatividade;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * pessoalVidaFuncionalDesligamentoInatividade
 * <p>
 * Dados de Desligamento ou Inatividade
 * 
 */
public class PessoalVidaFuncionalDesligamentoInatividade {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalDesligamentoInatividade.CodTipoEnvio codTipoEnvio;
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
     * Informa o tipo de desligamento ou inatividade
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalDesligamentoInatividade.CodTipoDesligamentoInatividade codTipoDesligamentoInatividade;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum CodTipoDesligamentoInatividade {

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
        _12(12);
        private final Integer value;
        private final static Map<Integer, CodTipoDesligamentoInatividade> CONSTANTS = new HashMap<Integer, CodTipoDesligamentoInatividade>();

        static {
            for (CodTipoDesligamentoInatividade c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDesligamentoInatividade(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDesligamentoInatividade fromValue(Integer value) {
            CodTipoDesligamentoInatividade constant = CONSTANTS.get(value);
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
