
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalLegislacao
 * <p>
 * Legislação e Normas de Pessoal
 * 
 */
public class PessoalLegislacao {

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    @NotNull
    private PessoalLegislacao.CodTipoEnte codTipoEnte;
    /**
     * Tipo da Norma
     * (Required)
     * 
     */
    @NotNull
    private PessoalLegislacao.CodTipoNorma codTipoNorma;
    /**
     * Detalhamento da Norma
     * (Required)
     * 
     */
    @NotNull
    private PessoalLegislacao.CodDetalhamentoNorma codDetalhamentoNorma;
    /**
     * Número da norma (sem o ano)
     * (Required)
     * 
     */
    @NotNull
    private String numeroDaNorma;
    /**
     * Ano da Norma com 4 dígitos (AAAA)
     * (Required)
     * 
     */
    @DecimalMin("1900")
    @DecimalMax("2050")
    @NotNull
    private Integer anoDaNorma;
    /**
     * Data da Publicação
     * (Required)
     * 
     */
    @NotNull
    private String dataPublicacao;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    @NotNull
    private String inicioVigencia;
    /**
     * Data de inicio do efeito financeiro
     * 
     */
    private String dataInicioEfeitoFinanceiro;
    /**
     * Data do fim da vigência
     * 
     */
    private String fimVigencia;
    /**
     * Ementa da Norma
     * (Required)
     * 
     */
    @NotNull
    private String ementaDaNorma;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private PessoalLegislacao.CodTipoEnvio codTipoEnvio;
    /**
     * Motivo da retificação de dados.
     * 
     */
    private String motivoRetificacao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<AssuntosDaNorma> assuntosDaNorma = null;
    /**
     * aNormaRegulamentaOutroIdpessoallegislacao
     * <p>
     * Informar se a presente Norma, regulamenta outra Norma/Legislação
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private ANormaRegulamentaOutroIdpessoallegislacao aNormaRegulamentaOutroIdpessoallegislacao;
    /**
     * unidadesGestorasAplicaveis
     * <p>
     * Informa todas as Unidades Gestoras, as quais a presente Norma/Legislação é Aplicável. 
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private UnidadesGestorasAplicaveis unidadesGestorasAplicaveis;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<TextoDaNormaOuLegislacao> textoDaNormaOuLegislacao = null;

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    public CodTipoEnte getCodTipoEnte() {
        return codTipoEnte;
    }

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    public void setCodTipoEnte(CodTipoEnte codTipoEnte) {
        this.codTipoEnte = codTipoEnte;
    }

    /**
     * Tipo da Norma
     * (Required)
     * 
     */
    public CodTipoNorma getCodTipoNorma() {
        return codTipoNorma;
    }

    /**
     * Tipo da Norma
     * (Required)
     * 
     */
    public void setCodTipoNorma(CodTipoNorma codTipoNorma) {
        this.codTipoNorma = codTipoNorma;
    }

    /**
     * Detalhamento da Norma
     * (Required)
     * 
     */
    public CodDetalhamentoNorma getCodDetalhamentoNorma() {
        return codDetalhamentoNorma;
    }

    /**
     * Detalhamento da Norma
     * (Required)
     * 
     */
    public void setCodDetalhamentoNorma(CodDetalhamentoNorma codDetalhamentoNorma) {
        this.codDetalhamentoNorma = codDetalhamentoNorma;
    }

    /**
     * Número da norma (sem o ano)
     * (Required)
     * 
     */
    public String getNumeroDaNorma() {
        return numeroDaNorma;
    }

    /**
     * Número da norma (sem o ano)
     * (Required)
     * 
     */
    public void setNumeroDaNorma(String numeroDaNorma) {
        this.numeroDaNorma = numeroDaNorma;
    }

    /**
     * Ano da Norma com 4 dígitos (AAAA)
     * (Required)
     * 
     */
    public Integer getAnoDaNorma() {
        return anoDaNorma;
    }

    /**
     * Ano da Norma com 4 dígitos (AAAA)
     * (Required)
     * 
     */
    public void setAnoDaNorma(Integer anoDaNorma) {
        this.anoDaNorma = anoDaNorma;
    }

    /**
     * Data da Publicação
     * (Required)
     * 
     */
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Data da Publicação
     * (Required)
     * 
     */
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    public String getInicioVigencia() {
        return inicioVigencia;
    }

    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    /**
     * Data de inicio do efeito financeiro
     * 
     */
    public String getDataInicioEfeitoFinanceiro() {
        return dataInicioEfeitoFinanceiro;
    }

    /**
     * Data de inicio do efeito financeiro
     * 
     */
    public void setDataInicioEfeitoFinanceiro(String dataInicioEfeitoFinanceiro) {
        this.dataInicioEfeitoFinanceiro = dataInicioEfeitoFinanceiro;
    }

    /**
     * Data do fim da vigência
     * 
     */
    public String getFimVigencia() {
        return fimVigencia;
    }

    /**
     * Data do fim da vigência
     * 
     */
    public void setFimVigencia(String fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    /**
     * Ementa da Norma
     * (Required)
     * 
     */
    public String getEmentaDaNorma() {
        return ementaDaNorma;
    }

    /**
     * Ementa da Norma
     * (Required)
     * 
     */
    public void setEmentaDaNorma(String ementaDaNorma) {
        this.ementaDaNorma = ementaDaNorma;
    }

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public CodTipoEnvio getCodTipoEnvio() {
        return codTipoEnvio;
    }

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public void setCodTipoEnvio(CodTipoEnvio codTipoEnvio) {
        this.codTipoEnvio = codTipoEnvio;
    }

    /**
     * Motivo da retificação de dados.
     * 
     */
    public String getMotivoRetificacao() {
        return motivoRetificacao;
    }

    /**
     * Motivo da retificação de dados.
     * 
     */
    public void setMotivoRetificacao(String motivoRetificacao) {
        this.motivoRetificacao = motivoRetificacao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Set<AssuntosDaNorma> getAssuntosDaNorma() {
        return assuntosDaNorma;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setAssuntosDaNorma(Set<AssuntosDaNorma> assuntosDaNorma) {
        this.assuntosDaNorma = assuntosDaNorma;
    }

    /**
     * aNormaRegulamentaOutroIdpessoallegislacao
     * <p>
     * Informar se a presente Norma, regulamenta outra Norma/Legislação
     * (Required)
     * 
     */
    public ANormaRegulamentaOutroIdpessoallegislacao getANormaRegulamentaOutroIdpessoallegislacao() {
        return aNormaRegulamentaOutroIdpessoallegislacao;
    }

    /**
     * aNormaRegulamentaOutroIdpessoallegislacao
     * <p>
     * Informar se a presente Norma, regulamenta outra Norma/Legislação
     * (Required)
     * 
     */
    public void setANormaRegulamentaOutroIdpessoallegislacao(ANormaRegulamentaOutroIdpessoallegislacao aNormaRegulamentaOutroIdpessoallegislacao) {
        this.aNormaRegulamentaOutroIdpessoallegislacao = aNormaRegulamentaOutroIdpessoallegislacao;
    }

    /**
     * unidadesGestorasAplicaveis
     * <p>
     * Informa todas as Unidades Gestoras, as quais a presente Norma/Legislação é Aplicável. 
     * (Required)
     * 
     */
    public UnidadesGestorasAplicaveis getUnidadesGestorasAplicaveis() {
        return unidadesGestorasAplicaveis;
    }

    /**
     * unidadesGestorasAplicaveis
     * <p>
     * Informa todas as Unidades Gestoras, as quais a presente Norma/Legislação é Aplicável. 
     * (Required)
     * 
     */
    public void setUnidadesGestorasAplicaveis(UnidadesGestorasAplicaveis unidadesGestorasAplicaveis) {
        this.unidadesGestorasAplicaveis = unidadesGestorasAplicaveis;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Set<TextoDaNormaOuLegislacao> getTextoDaNormaOuLegislacao() {
        return textoDaNormaOuLegislacao;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setTextoDaNormaOuLegislacao(Set<TextoDaNormaOuLegislacao> textoDaNormaOuLegislacao) {
        this.textoDaNormaOuLegislacao = textoDaNormaOuLegislacao;
    }

    public enum CodDetalhamentoNorma {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12),
        _13(13);
        private final Integer value;
        private final static Map<Integer, CodDetalhamentoNorma> CONSTANTS = new HashMap<Integer, CodDetalhamentoNorma>();

        static {
            for (CodDetalhamentoNorma c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodDetalhamentoNorma(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodDetalhamentoNorma fromValue(Integer value) {
            CodDetalhamentoNorma constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoEnte {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoEnte> CONSTANTS = new HashMap<Integer, CodTipoEnte>();

        static {
            for (CodTipoEnte c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnte(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnte fromValue(Integer value) {
            CodTipoEnte constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

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

    public enum CodTipoNorma {

        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12),
        _13(13),
        _14(14),
        _15(15),
        _16(16),
        _17(17);
        private final Integer value;
        private final static Map<Integer, CodTipoNorma> CONSTANTS = new HashMap<Integer, CodTipoNorma>();

        static {
            for (CodTipoNorma c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoNorma(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoNorma fromValue(Integer value) {
            CodTipoNorma constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
