
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * textoDoEdital
 * <p>
 * Contem os documentos relativos ao corpo do Edital e seus Anexos
 * 
 */
public class TextoDoEdital {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    public TextoDoEdital.CodTipoDocumento codTipoDocumento;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum CodTipoDocumento {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoDocumento> CONSTANTS = new HashMap<Integer, CodTipoDocumento>();

        static {
            for (CodTipoDocumento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDocumento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDocumento fromValue(Integer value) {
            CodTipoDocumento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
