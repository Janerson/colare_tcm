
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * habilitacao
 * <p>
 * Habilitação do licitante
 * 
 */
public class Habilitacao {

    /**
     * Informar se foi registrado em ata a presença do preposto do licitante
     * (Required)
     * 
     */
    @NotNull
    public Boolean registrouEmAtaPresencaPrepostoDoLicitante;
    /**
     * Informar se o licitante renunciou ao prazo recursal
     * (Required)
     * 
     */
    @NotNull
    public Boolean renunciaPrazoRecursal;
    /**
     * Status da Habilitação
     * (Required)
     * 
     */
    @NotNull
    public Habilitacao.StatusHabilitacao statusHabilitacao;
    /**
     * Motivo da Inabilitação
     * 
     */
    public String motivoDaInabilitacao;

    public enum StatusHabilitacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, StatusHabilitacao> CONSTANTS = new HashMap<Integer, StatusHabilitacao>();

        static {
            for (StatusHabilitacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private StatusHabilitacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static StatusHabilitacao fromValue(Integer value) {
            StatusHabilitacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
