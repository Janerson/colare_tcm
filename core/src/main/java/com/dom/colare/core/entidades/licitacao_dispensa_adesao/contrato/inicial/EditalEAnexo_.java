
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * editalEAnexos
 * <p>
 * Edital do Credenciamento / Chamada Pública - Preenchimento exclusivo e obrigatório se tipoProcesso = 1 ou 3 (Credenciamento ou chamada pública). Arquivos PDF do Edital e seus Anexos.
 * 
 */
public class EditalEAnexo_ {

    /**
     * Código do tipo de documento enviado - Edital e Anexos, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    public EditalEAnexo_.CodTipoEditalAnexos codTipoEditalAnexos;
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
