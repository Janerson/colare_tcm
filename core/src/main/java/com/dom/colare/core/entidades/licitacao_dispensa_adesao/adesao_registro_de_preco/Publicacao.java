
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * publicacao
 * <p>
 * Publicação do termo de adesão a registro de preços
 * 
 */
public class Publicacao {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
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
