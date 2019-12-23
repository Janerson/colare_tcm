
package com.dom.colare.core.entidades.folha_pagamento.pessoal_folha_pagamento;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalFolhaDePagamento
 * <p>
 * Contém as informações relacionadas à Folha de Pagamento.
 * 
 */
public class PessoalFolhaDePagamento {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalFolhaDePagamento.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Informar o mês de competência da folha de pagamento 
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("13")
    @NotNull
    public Integer mesCompetencia;
    /**
     * Informar o ano de competência da Folha de Pagamento
     * (Required)
     * 
     */
    @DecimalMin("2020")
    @NotNull
    public Integer anoCompetencia;
    /**
     * Informa o tipo de Unidade Gestora Responsável pela Folha, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public PessoalFolhaDePagamento.TipoUnidadeGestoraResponsavelFolha tipoUnidadeGestoraResponsavelFolha;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<FolhaDePagamento> folhaDePagamento = null;

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

    public enum TipoUnidadeGestoraResponsavelFolha {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7);
        private final Integer value;
        private final static Map<Integer, TipoUnidadeGestoraResponsavelFolha> CONSTANTS = new HashMap<Integer, TipoUnidadeGestoraResponsavelFolha>();

        static {
            for (TipoUnidadeGestoraResponsavelFolha c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoUnidadeGestoraResponsavelFolha(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoUnidadeGestoraResponsavelFolha fromValue(Integer value) {
            TipoUnidadeGestoraResponsavelFolha constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
