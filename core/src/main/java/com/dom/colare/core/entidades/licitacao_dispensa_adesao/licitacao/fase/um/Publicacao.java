
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * publicacao
 * <p>
 * Informação de todas as publicações do Edital ou Convite
 * 
 */
@Entity
@Data
public class Publicacao extends BaseEntityID {

    /**
     * Data da Publicação
     * (Required)
     * 
     */
    @NotNull
    public String dataPublicacao;
    /**
     * Código do veículo da Publicação
     * (Required)
     * 
     */
    @NotNull
    public Publicacao.CodVeiculoPublicacao codVeiculoPublicacao;
    /**
     * Descrição
     * 
     */
    public String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum CodVeiculoPublicacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _9999(9999);
        private final Integer value;
        private final static Map<Integer, CodVeiculoPublicacao> CONSTANTS = new HashMap<Integer, CodVeiculoPublicacao>();

        static {
            for (CodVeiculoPublicacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodVeiculoPublicacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodVeiculoPublicacao fromValue(Integer value) {
            CodVeiculoPublicacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
