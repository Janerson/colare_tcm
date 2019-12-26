
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoMembrosComissao
 * <p>
 * Informar a composição da Comissão Organizadora da Seleção
 * 
 */
public class DetalhamentoMembrosComissao {

    /**
     * Tipo de função exercida na Comissão Organizadora da Seleção, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoMembrosComissao.CodTipoDeFuncaoComissaoOrganizadora codTipoDeFuncaoComissaoOrganizadora;
    /**
     * Número do CPF
     * (Required)
     * 
     */
    @NotNull
    public String numeroCpf;

    public enum CodTipoDeFuncaoComissaoOrganizadora {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoDeFuncaoComissaoOrganizadora> CONSTANTS = new HashMap<Integer, CodTipoDeFuncaoComissaoOrganizadora>();

        static {
            for (CodTipoDeFuncaoComissaoOrganizadora c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDeFuncaoComissaoOrganizadora(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDeFuncaoComissaoOrganizadora fromValue(Integer value) {
            CodTipoDeFuncaoComissaoOrganizadora constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
