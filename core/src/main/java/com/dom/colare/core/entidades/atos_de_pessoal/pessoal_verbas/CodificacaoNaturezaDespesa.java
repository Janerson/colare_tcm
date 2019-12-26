
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * codificacaoNaturezaDespesa
 * <p>
 * Informa os Dados da Codificação Natureza Despesa
 * 
 */
public class CodificacaoNaturezaDespesa {

    /**
     * Informa a Categoria Economica da Despesa
     * (Required)
     * 
     */
    @NotNull
    private CodificacaoNaturezaDespesa.CodCategoriaEconomica codCategoriaEconomica;
    /**
     * Informa o Grupo da Natureza de Despesa
     * (Required)
     * 
     */
    @NotNull
    private CodificacaoNaturezaDespesa.CodGrupoNaturezaDespesa codGrupoNaturezaDespesa;
    /**
     * Informa a Modalidade de Aplicacao
     * (Required)
     * 
     */
    @NotNull
    private CodificacaoNaturezaDespesa.CodModalidadeAplicacao codModalidadeAplicacao;
    /**
     * Informa Elemento Despesa
     * (Required)
     * 
     */
    @NotNull
    private CodificacaoNaturezaDespesa.CodElementoDespesa codElementoDespesa;
    /**
     * Subelemento da despesa
     * (Required)
     * 
     */
    @NotNull
    private Integer subelemento;

    /**
     * Informa a Categoria Economica da Despesa
     * (Required)
     * 
     */
    public CodCategoriaEconomica getCodCategoriaEconomica() {
        return codCategoriaEconomica;
    }

    /**
     * Informa a Categoria Economica da Despesa
     * (Required)
     * 
     */
    public void setCodCategoriaEconomica(CodCategoriaEconomica codCategoriaEconomica) {
        this.codCategoriaEconomica = codCategoriaEconomica;
    }

    /**
     * Informa o Grupo da Natureza de Despesa
     * (Required)
     * 
     */
    public CodGrupoNaturezaDespesa getCodGrupoNaturezaDespesa() {
        return codGrupoNaturezaDespesa;
    }

    /**
     * Informa o Grupo da Natureza de Despesa
     * (Required)
     * 
     */
    public void setCodGrupoNaturezaDespesa(CodGrupoNaturezaDespesa codGrupoNaturezaDespesa) {
        this.codGrupoNaturezaDespesa = codGrupoNaturezaDespesa;
    }

    /**
     * Informa a Modalidade de Aplicacao
     * (Required)
     * 
     */
    public CodModalidadeAplicacao getCodModalidadeAplicacao() {
        return codModalidadeAplicacao;
    }

    /**
     * Informa a Modalidade de Aplicacao
     * (Required)
     * 
     */
    public void setCodModalidadeAplicacao(CodModalidadeAplicacao codModalidadeAplicacao) {
        this.codModalidadeAplicacao = codModalidadeAplicacao;
    }

    /**
     * Informa Elemento Despesa
     * (Required)
     * 
     */
    public CodElementoDespesa getCodElementoDespesa() {
        return codElementoDespesa;
    }

    /**
     * Informa Elemento Despesa
     * (Required)
     * 
     */
    public void setCodElementoDespesa(CodElementoDespesa codElementoDespesa) {
        this.codElementoDespesa = codElementoDespesa;
    }

    /**
     * Subelemento da despesa
     * (Required)
     * 
     */
    public Integer getSubelemento() {
        return subelemento;
    }

    /**
     * Subelemento da despesa
     * (Required)
     * 
     */
    public void setSubelemento(Integer subelemento) {
        this.subelemento = subelemento;
    }

    public enum CodCategoriaEconomica {

        _3(3);
        private final Integer value;
        private final static Map<Integer, CodCategoriaEconomica> CONSTANTS = new HashMap<Integer, CodCategoriaEconomica>();

        static {
            for (CodCategoriaEconomica c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodCategoriaEconomica(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodCategoriaEconomica fromValue(Integer value) {
            CodCategoriaEconomica constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodElementoDespesa {

        _1(1),
        _3(3),
        _4(4),
        _5(5),
        _7(7),
        _8(8),
        _10(10),
        _11(11),
        _13(13),
        _16(16),
        _46(46),
        _49(49),
        _91(91),
        _92(92),
        _93(93),
        _94(94),
        _96(96);
        private final Integer value;
        private final static Map<Integer, CodElementoDespesa> CONSTANTS = new HashMap<Integer, CodElementoDespesa>();

        static {
            for (CodElementoDespesa c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodElementoDespesa(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodElementoDespesa fromValue(Integer value) {
            CodElementoDespesa constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodGrupoNaturezaDespesa {

        _1(1),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodGrupoNaturezaDespesa> CONSTANTS = new HashMap<Integer, CodGrupoNaturezaDespesa>();

        static {
            for (CodGrupoNaturezaDespesa c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodGrupoNaturezaDespesa(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodGrupoNaturezaDespesa fromValue(Integer value) {
            CodGrupoNaturezaDespesa constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodModalidadeAplicacao {

        _90(90),
        _91(91),
        _95(95),
        _96(96);
        private final Integer value;
        private final static Map<Integer, CodModalidadeAplicacao> CONSTANTS = new HashMap<Integer, CodModalidadeAplicacao>();

        static {
            for (CodModalidadeAplicacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodModalidadeAplicacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodModalidadeAplicacao fromValue(Integer value) {
            CodModalidadeAplicacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
