
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a 1 - Licitação, com os dados da licitação da qual resultou o contrato original e o seu aditivo.
 * 
 */
public class Licitacao {

    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    @NotNull
    public Licitacao.CodModalidadeLicitacao codModalidadeLicitacao;
    /**
     * Exercício do edital da licitação
     * (Required)
     * 
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    public Integer exercicioLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull
    public Integer numeroLicitacao;

    public enum CodModalidadeLicitacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8);
        private final Integer value;
        private final static Map<Integer, CodModalidadeLicitacao> CONSTANTS = new HashMap<Integer, CodModalidadeLicitacao>();

        static {
            for (CodModalidadeLicitacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodModalidadeLicitacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodModalidadeLicitacao fromValue(Integer value) {
            CodModalidadeLicitacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
