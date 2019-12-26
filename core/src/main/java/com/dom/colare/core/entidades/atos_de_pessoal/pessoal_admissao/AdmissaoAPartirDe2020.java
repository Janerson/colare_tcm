
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * admissaoAPartirDe2020
 * <p>
 * Informar dados da admissão se ocorridas a partir de 2020
 * 
 */
public class AdmissaoAPartirDe2020 {

    /**
     * Informa o ID da Homologação
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalHomologacao;
    /**
     * Tipo de Lista de Classificacao
     * (Required)
     * 
     */
    @NotNull
    private AdmissaoAPartirDe2020 .TipoListaClassificacao tipoListaClassificacao;
    /**
     * Informar a numero da classificação do candidato
     * (Required)
     * 
     */
    @NotNull
    private Integer numeroOrdemClassificacao;

    /**
     * Informa o ID da Homologação
     * (Required)
     * 
     */
    public Integer getIdPessoalHomologacao() {
        return idPessoalHomologacao;
    }

    /**
     * Informa o ID da Homologação
     * (Required)
     * 
     */
    public void setIdPessoalHomologacao(Integer idPessoalHomologacao) {
        this.idPessoalHomologacao = idPessoalHomologacao;
    }

    /**
     * Tipo de Lista de Classificacao
     * (Required)
     * 
     */
    public TipoListaClassificacao getTipoListaClassificacao() {
        return tipoListaClassificacao;
    }

    /**
     * Tipo de Lista de Classificacao
     * (Required)
     * 
     */
    public void setTipoListaClassificacao(TipoListaClassificacao tipoListaClassificacao) {
        this.tipoListaClassificacao = tipoListaClassificacao;
    }

    /**
     * Informar a numero da classificação do candidato
     * (Required)
     * 
     */
    public Integer getNumeroOrdemClassificacao() {
        return numeroOrdemClassificacao;
    }

    /**
     * Informar a numero da classificação do candidato
     * (Required)
     * 
     */
    public void setNumeroOrdemClassificacao(Integer numeroOrdemClassificacao) {
        this.numeroOrdemClassificacao = numeroOrdemClassificacao;
    }

    public enum TipoListaClassificacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, TipoListaClassificacao> CONSTANTS = new HashMap<Integer, TipoListaClassificacao>();

        static {
            for (TipoListaClassificacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoListaClassificacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoListaClassificacao fromValue(Integer value) {
            TipoListaClassificacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
