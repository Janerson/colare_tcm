
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * requisitosAtoAdministrativo
 * <p>
 * Contém os dados do requerimento inicial.
 * 
 */
public class RequisitosAtoAdministrativo {

    /**
     * Informa o tipo do Ato Administrativo
     * (Required)
     * 
     */
    @NotNull
    public RequisitosAtoAdministrativo.CodTipoAtoAdministrativo codTipoAtoAdministrativo;
    /**
     * Informa o numero do Ato Administrativo
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroAtoAdministrativo;
    /**
     * Informa a data do Ato Administrativo
     * (Required)
     * 
     */
    @NotNull
    public String dataAtoAdministrativo;
    /**
     * Data de inicio do efeito financeiro
     * (Required)
     * 
     */
    @NotNull
    public String dataInicioEfeitoFinanceiro;
    /**
     * Data da Publicação
     * (Required)
     * 
     */
    @NotNull
    public String dataPublicacao;
    /**
     * Informar a Certidão ou Comprovante de Publicação 
     * (Required)
     * 
     */
    @NotNull
    public String certidaoDePublicacaoOuComprovante;
    /**
     * Informa qual a forma de reajuste dos Proventos de Inativo Pensionista.
     * (Required)
     * 
     */
    @NotNull
    public RequisitosAtoAdministrativo.CodFormaDeReajuste codFormaDeReajuste;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Numerocpfdoresponsavelpeloato> numerocpfdoresponsavelpeloato = null;

    public enum CodFormaDeReajuste {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodFormaDeReajuste> CONSTANTS = new HashMap<Integer, CodFormaDeReajuste>();

        static {
            for (CodFormaDeReajuste c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodFormaDeReajuste(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodFormaDeReajuste fromValue(Integer value) {
            CodFormaDeReajuste constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoAtoAdministrativo {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoAtoAdministrativo> CONSTANTS = new HashMap<Integer, CodTipoAtoAdministrativo>();

        static {
            for (CodTipoAtoAdministrativo c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoAtoAdministrativo(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoAtoAdministrativo fromValue(Integer value) {
            CodTipoAtoAdministrativo constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
