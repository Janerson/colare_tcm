
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoNomeacaoSubJudice
 * <p>
 * informar o Detalhamento da Nomeacao Sub Judice
 * 
 */
public class DetalhamentoNomeacaoSubJudice {

    /**
     * Informa o detalhamento da peça Decisão Judicial, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private DetalhamentoNomeacaoSubJudice.DetalhamentoPecaJudicial detalhamentoPecaJudicial;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

    /**
     * Informa o detalhamento da peça Decisão Judicial, conforme tabela.
     * (Required)
     * 
     */
    public DetalhamentoPecaJudicial getDetalhamentoPecaJudicial() {
        return detalhamentoPecaJudicial;
    }

    /**
     * Informa o detalhamento da peça Decisão Judicial, conforme tabela.
     * (Required)
     * 
     */
    public void setDetalhamentoPecaJudicial(DetalhamentoPecaJudicial detalhamentoPecaJudicial) {
        this.detalhamentoPecaJudicial = detalhamentoPecaJudicial;
    }

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public String getIdDocumentoPDF() {
        return idDocumentoPDF;
    }

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public void setIdDocumentoPDF(String idDocumentoPDF) {
        this.idDocumentoPDF = idDocumentoPDF;
    }

    public enum DetalhamentoPecaJudicial {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, DetalhamentoPecaJudicial> CONSTANTS = new HashMap<Integer, DetalhamentoPecaJudicial>();

        static {
            for (DetalhamentoPecaJudicial c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DetalhamentoPecaJudicial(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static DetalhamentoPecaJudicial fromValue(Integer value) {
            DetalhamentoPecaJudicial constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
