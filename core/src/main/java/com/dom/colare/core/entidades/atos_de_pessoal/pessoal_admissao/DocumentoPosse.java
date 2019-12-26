
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * documentoPosse
 * <p>
 * Documentos para Posse
 * 
 */
public class DocumentoPosse {

    /**
     * Informar o tipo de documento usado para Posse do servidor.
     * (Required)
     * 
     */
    @NotNull
    private DocumentoPosse.TipoDocumentoPosse tipoDocumentoPosse;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

    /**
     * Informar o tipo de documento usado para Posse do servidor.
     * (Required)
     * 
     */
    public TipoDocumentoPosse getTipoDocumentoPosse() {
        return tipoDocumentoPosse;
    }

    /**
     * Informar o tipo de documento usado para Posse do servidor.
     * (Required)
     * 
     */
    public void setTipoDocumentoPosse(TipoDocumentoPosse tipoDocumentoPosse) {
        this.tipoDocumentoPosse = tipoDocumentoPosse;
    }

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public String getIdDocumentoPDF() {
        return idDocumentoPDF;
    }

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public void setIdDocumentoPDF(String idDocumentoPDF) {
        this.idDocumentoPDF = idDocumentoPDF;
    }

    public enum TipoDocumentoPosse {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, TipoDocumentoPosse> CONSTANTS = new HashMap<Integer, TipoDocumentoPosse>();

        static {
            for (TipoDocumentoPosse c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoDocumentoPosse(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoDocumentoPosse fromValue(Integer value) {
            TipoDocumentoPosse constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
