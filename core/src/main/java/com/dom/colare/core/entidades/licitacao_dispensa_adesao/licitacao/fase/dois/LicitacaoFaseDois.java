
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * licitacaoFase2
 * <p>
 * Habilitação, Julgamento, Adjudicação e Homologação do processo licitatório
 * 
 */
@Entity
@Data
public class LicitacaoFaseDois extends BaseEntityID {

    /**
     * ID do processo de abertura da licitação (Fase 1)
     * (Required)
     * 
     */
    @NotNull
    public Integer idLicitacaoFase1;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public LicitacaoFaseDois.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    @Valid
    public Set<Licitante> licitantes = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Resultado> resultado = null;
    @Valid
    public Set<ResponsaveisPelaLicitacao> responsaveisPelaLicitacao = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ParecerFaseDois> parecerFaseDois = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<AtasLicitacao> atasLicitacao = null;

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

}
