
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_vida_funcional_lotacao;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * detalhamentoLotacao
 * <p>
 * Detalhamento da lotação do servidor
 * 
 */
public class DetalhamentoLotacao {

    /**
     * Informa o tipo de local de locação do servidor.
     * (Required)
     * 
     */
    @NotNull
    public DetalhamentoLotacao.CodTipoLotacao codTipoLotacao;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * Informa o Nome do Local de Lotação. Exemplo: "Gerência de Recursos Humanos e Folha de Pagamento"
     * (Required)
     * 
     */
    @NotNull
    public String nomeLocalLotacao;
    /**
     * Informa o nome do Departamento ou Setor (se existir)  no qual o servidor foi lotado. Exemplo : "Setor de Folha de Pagamento"
     * (Required)
     * 
     */
    @NotNull
    public String nomeDepartamentoSetorLotacao;

    public enum CodTipoLotacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoLotacao> CONSTANTS = new HashMap<Integer, CodTipoLotacao>();

        static {
            for (CodTipoLotacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoLotacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoLotacao fromValue(Integer value) {
            CodTipoLotacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
