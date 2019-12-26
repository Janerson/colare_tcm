
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * textoEdital
 * <p>
 * Informa o texto do edital e anexo
 * 
 */
public class TextoEdital {

    /**
     * Código do tipo de documento enviado - Edital e Anexos, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    public TextoEdital.CodTipoEditalAnexos codTipoEditalAnexos;
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

    public enum CodTipoEditalAnexos {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoEditalAnexos> CONSTANTS = new HashMap<Integer, CodTipoEditalAnexos>();

        static {
            for (CodTipoEditalAnexos c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEditalAnexos(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEditalAnexos fromValue(Integer value) {
            CodTipoEditalAnexos constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
