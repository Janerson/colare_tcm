
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * pensaoMerce
 * <p>
 * Contem as informações Pensão Mercê.
 * 
 */
public class PensaoMerce {

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    @NotNull
    public Integer idCadastroPessoal;
    /**
     * Informa qual o tipo documento concedeu Pensão Mercê
     * (Required)
     * 
     */
    @NotNull
    public PensaoMerce.TipoDocumentoConcessaoPensaoMerce tipoDocumentoConcessaoPensaoMerce;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum TipoDocumentoConcessaoPensaoMerce {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, TipoDocumentoConcessaoPensaoMerce> CONSTANTS = new HashMap<Integer, TipoDocumentoConcessaoPensaoMerce>();

        static {
            for (TipoDocumentoConcessaoPensaoMerce c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoDocumentoConcessaoPensaoMerce(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoDocumentoConcessaoPensaoMerce fromValue(Integer value) {
            TipoDocumentoConcessaoPensaoMerce constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
