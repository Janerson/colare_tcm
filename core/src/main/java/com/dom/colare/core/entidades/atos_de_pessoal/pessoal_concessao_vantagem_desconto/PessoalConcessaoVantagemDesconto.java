
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalConcessaoVantagemDesconto
 * <p>
 * Dados das concessões de Vantagens e Descontos, que repercutirão na Folha de Pagamento.
 * 
 */
public class PessoalConcessaoVantagemDesconto {

    /**
     * Informa o tipo  da Situação Funcional que o servidor encontra-se (Ativo ou Inativo), conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public PessoalConcessaoVantagemDesconto.TipoSituacaoFuncional tipoSituacaoFuncional;
    /**
     * Informa o ID do formulario correspondente (Pessoal Admissão, Aposentadoria ou Pensão) ao informado na tabela de Situação Funcional.
     * (Required)
     * 
     */
    @NotNull
    public Integer idSituacaoFuncionalCorrespondente;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalConcessaoVantagemDesconto.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * detalhamentoConcessao
     * <p>
     * Contém o Detalhamento da Concessão
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DetalhamentoConcessao detalhamentoConcessao;

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

    public enum TipoSituacaoFuncional {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, TipoSituacaoFuncional> CONSTANTS = new HashMap<Integer, TipoSituacaoFuncional>();

        static {
            for (TipoSituacaoFuncional c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoSituacaoFuncional(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoSituacaoFuncional fromValue(Integer value) {
            TipoSituacaoFuncional constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
