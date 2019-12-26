
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_lotacao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalVidaFuncionalLotacao
 * <p>
 * Dados de Lotação (Movimentação Interna)
 * 
 */
public class PessoalVidaFuncionalLotacao {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalVidaFuncionalLotacao.CodTipoEnvio codTipoEnvio;
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
     * detalhamentoLotacao
     * <p>
     * Detalhamento da lotação do servidor
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DetalhamentoLotacao detalhamentoLotacao;

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
