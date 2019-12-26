
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * textoDaNormaOuLegislacao
 * <p>
 * Anexar os arquivos (Formato PDF-A) referentes ao Texto e/ou Anexos da Norma/Legislação
 * 
 */
public class TextoDaNormaOuLegislacao {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * Informar o código conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private TextoDaNormaOuLegislacao.CodTipoTextoDocumento codTipoTextoDocumento;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;

    /**
     * Descrição
     * (Required)
     * 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Descrição
     * (Required)
     * 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Informar o código conforme tabela.
     * (Required)
     * 
     */
    public CodTipoTextoDocumento getCodTipoTextoDocumento() {
        return codTipoTextoDocumento;
    }

    /**
     * Informar o código conforme tabela.
     * (Required)
     * 
     */
    public void setCodTipoTextoDocumento(CodTipoTextoDocumento codTipoTextoDocumento) {
        this.codTipoTextoDocumento = codTipoTextoDocumento;
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

    public enum CodTipoTextoDocumento {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoTextoDocumento> CONSTANTS = new HashMap<Integer, CodTipoTextoDocumento>();

        static {
            for (CodTipoTextoDocumento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoTextoDocumento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoTextoDocumento fromValue(Integer value) {
            CodTipoTextoDocumento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
