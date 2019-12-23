
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * documentos
 * <p>
 * Dados dos documentos relacionados à adesão
 * 
 */
public class Documento {

    /**
     * Tipo do documento anexado relacionado à adesão
     * (Required)
     * 
     */
    @NotNull
    public Documento.CodTipoDocumentoAnexadoAdesao codTipoDocumentoAnexadoAdesao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum CodTipoDocumentoAnexadoAdesao {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoDocumentoAnexadoAdesao> CONSTANTS = new HashMap<Integer, CodTipoDocumentoAnexadoAdesao>();

        static {
            for (CodTipoDocumentoAnexadoAdesao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDocumentoAnexadoAdesao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDocumentoAnexadoAdesao fromValue(Integer value) {
            CodTipoDocumentoAnexadoAdesao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
