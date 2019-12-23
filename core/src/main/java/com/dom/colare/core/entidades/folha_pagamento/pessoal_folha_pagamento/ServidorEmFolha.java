
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * servidorEmFolha
 * <p>
 * Informa os servidores que estão em folha e suas verbas (remuneratórias ou descontos)
 * 
 */
public class ServidorEmFolha {

    /**
     * Informa o tipo  da Situação Funcional que o servidor encontra-se (Ativo ou Inativo), conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public ServidorEmFolha.TipoSituacaoFuncional tipoSituacaoFuncional;
    /**
     * Informa o ID do formulario correspondente (Pessoal Admissão, Aposentadoria ou Pensão) ao informado na tabela de Situação Funcional.
     * (Required)
     * 
     */
    @NotNull
    public Integer idSituacaoFuncionalCorrespondente;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<RemuneracaoOuDescontoDoServidor> remuneracaoOuDescontoDoServidor = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DescontoPrevidenciario> descontoPrevidenciario = null;
    @Valid
    public Set<DescontoIrrf> descontoIrrf = null;

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
