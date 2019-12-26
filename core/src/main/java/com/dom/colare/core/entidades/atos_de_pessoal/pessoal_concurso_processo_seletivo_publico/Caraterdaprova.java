
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * caraterdaprova
 * <p>
 * Informar detalhes sobre o caráter da prova e clausulas sobre pontuação da prova. 
 * 
 */
public class Caraterdaprova {

    /**
     * Caráter da prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public Caraterdaprova.TipoCaraterProva tipoCaraterProva;
    /**
     * Há Clausula com a pontuação miníma para classificação.
     * (Required)
     * 
     */
    @NotNull
    public Boolean haClausulaComAPontuacaoMinimaParaClassificacao;
    /**
     * Há clausula que estabeleça critérios de aprovação para nota final.
     * (Required)
     * 
     */
    @NotNull
    public Boolean haClausulaQueEstabelecaCriteriosDeAprovacaoParaNotaFinal;
    @Valid
    public Set<DetalhamentoClausulaComAPontuacaoMinimaParaClassificacao> detalhamentoClausulaComAPontuacaoMinimaParaClassificacao = null;
    @Valid
    public Set<DetalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal> detalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal = null;

    public enum TipoCaraterProva {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, TipoCaraterProva> CONSTANTS = new HashMap<Integer, TipoCaraterProva>();

        static {
            for (TipoCaraterProva c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoCaraterProva(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoCaraterProva fromValue(Integer value) {
            TipoCaraterProva constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
