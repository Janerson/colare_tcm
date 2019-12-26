
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;


/**
 * verba
 * <p>
 * Contém as Informações referente a Verba (Remuneração Desconto) aplicada ao Servidor Ativo, Inativo ou o Pensionista.
 * 
 */
public class Verba {

    /**
     * Informa o ID da Verba, cadastrada no Layout Pessoal Verbas.
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalVerbas;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    public String dataInicio;
    /**
     * Data fim
     * 
     */
    public String dataFinal;
    /**
     * Informa a quantidade de parcelas.
     * 
     */
    public Integer numeroDeParcelas;
    /**
     * Tipo de Verba
     * (Required)
     * 
     */
    @NotNull
    public Verba.CodTipoVerba codTipoVerba;
    /**
     * Informa valor da Verba (Remuneração ou Desconto)
     * 
     */
    @DecimalMin("0")
    public Double valor;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    public String idDocumentoPDF;
    /**
     * informa a modalidade da remuneração, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public Verba.CodModalidadeRemuneracao codModalidadeRemuneracao;
    /**
     * Informa a modalidade do desconto, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public Verba.CodModalidadeDesconto codModalidadeDesconto;

    public enum CodModalidadeDesconto {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, CodModalidadeDesconto> CONSTANTS = new HashMap<Integer, CodModalidadeDesconto>();

        static {
            for (CodModalidadeDesconto c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodModalidadeDesconto(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodModalidadeDesconto fromValue(Integer value) {
            CodModalidadeDesconto constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodModalidadeRemuneracao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5);
        private final Integer value;
        private final static Map<Integer, CodModalidadeRemuneracao> CONSTANTS = new HashMap<Integer, CodModalidadeRemuneracao>();

        static {
            for (CodModalidadeRemuneracao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodModalidadeRemuneracao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodModalidadeRemuneracao fromValue(Integer value) {
            CodModalidadeRemuneracao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoVerba {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoVerba> CONSTANTS = new HashMap<Integer, CodTipoVerba>();

        static {
            for (CodTipoVerba c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoVerba(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoVerba fromValue(Integer value) {
            CodTipoVerba constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
