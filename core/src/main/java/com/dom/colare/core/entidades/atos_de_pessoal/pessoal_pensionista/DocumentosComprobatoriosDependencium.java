
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * documentosComprobatoriosDependencia
 * <p>
 * Contém os documento que comprovam vinculo do Dependente em relação ao Instituidor.
 * 
 */
public class DocumentosComprobatoriosDependencium {

    /**
     * Informa o tipo de documento que comprova a relação de dependência entre o pensionista e o instituidor, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public DocumentosComprobatoriosDependencium.TipoDocumentoComprobatorio tipoDocumentoComprobatorio;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;

    public enum TipoDocumentoComprobatorio {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10),
        _11(11),
        _12(12);
        private final Integer value;
        private final static Map<Integer, TipoDocumentoComprobatorio> CONSTANTS = new HashMap<Integer, TipoDocumentoComprobatorio>();

        static {
            for (TipoDocumentoComprobatorio c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoDocumentoComprobatorio(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoDocumentoComprobatorio fromValue(Integer value) {
            TipoDocumentoComprobatorio constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
