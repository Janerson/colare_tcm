
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoConcessao
 * <p>
 * Contém o Detalhamento da Concessão
 * 
 */
public class DetalhamentoConcessao {

    /**
     * Informa o tipo de concessão
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoConcessao.TipoConcessao tipoConcessao;
    /**
     * posicaoVencimentoCarreira
     * <p>
     * Contém as informações sobre o posicionamento vencimental do servidor na carreira.
     * 
     */
    @Valid
    public PosicaoVencimentoCarreira posicaoVencimentoCarreira;
    /**
     * verba
     * <p>
     * Contém as Informações referente a Verba (Remuneração Desconto) aplicada ao Servidor Ativo, Inativo ou o Pensionista.
     * 
     */
    @Valid
    public Verba verba;

    public enum TipoConcessao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7);
        private final Integer value;
        private final static Map<Integer, TipoConcessao> CONSTANTS = new HashMap<Integer, TipoConcessao>();

        static {
            for (TipoConcessao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoConcessao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoConcessao fromValue(Integer value) {
            TipoConcessao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
