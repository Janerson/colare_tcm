
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

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
 * comissao
 * <p>
 * Detalhamento da composição da comissão de licitação / Pregoeiro - Equipe de Apoio
 * 
 */
@Entity
@Data
public class Comissao extends BaseEntityID {

    /**
     * Código que identifica o tipo da comissão
     * (Required)
     * 
     */
    @NotNull
    public Comissao.CodTipoComissao codTipoComissao;
    /**
     * Tipo do ato de nomeação da comissão
     * (Required)
     * 
     */
    @NotNull
    public Comissao.CodTipoAtoNomeacao codTipoAtoNomeacao;
    /**
     * Número do Ato de Nomeação
     * (Required)
     * 
     */
    @NotNull
    public String numeroAtoNomeacao;
    /**
     * Data do Ato de Nomeação
     * (Required)
     * 
     */
    @NotNull
    public String dataAtoNomeacao;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    @NotNull
    public String inicioVigencia;
    /**
     * Data do fim da vigência
     * (Required)
     * 
     */
    @NotNull
    public String fimVigencia;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Membro> membro = null;

    public enum CodTipoAtoNomeacao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoAtoNomeacao> CONSTANTS = new HashMap<Integer, CodTipoAtoNomeacao>();

        static {
            for (CodTipoAtoNomeacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoAtoNomeacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoAtoNomeacao fromValue(Integer value) {
            CodTipoAtoNomeacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoComissao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoComissao> CONSTANTS = new HashMap<Integer, CodTipoComissao>();

        static {
            for (CodTipoComissao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoComissao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoComissao fromValue(Integer value) {
            CodTipoComissao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
