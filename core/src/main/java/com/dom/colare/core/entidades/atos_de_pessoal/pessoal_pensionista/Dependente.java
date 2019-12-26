
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * dependentes
 * <p>
 * Contém as Informações dos Dependentes do Instituidor
 * 
 */
public class Dependente {

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    @NotNull
    public Integer idCadastroPessoal;
    /**
     * Informar o tipo de dependência do pensionista, conforme tabela
     * (Required)
     * 
     */
    @NotNull
    public Dependente.TipoDependente tipoDependente;
    /**
     * Informa se o dependemte possui filhos com o Instituidor da pensão
     * (Required)
     * 
     */
    @NotNull
    public Boolean dependentePossuiFIlho;
    /**
     * Informa a Data Final da Pensão
     * (Required)
     * 
     */
    @NotNull
    public String dataFinalPensao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DocumentosComprobatoriosDependencium> documentosComprobatoriosDependencia = null;

    public enum TipoDependente {

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
        _11(11);
        private final Integer value;
        private final static Map<Integer, TipoDependente> CONSTANTS = new HashMap<Integer, TipoDependente>();

        static {
            for (TipoDependente c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoDependente(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TipoDependente fromValue(Integer value) {
            TipoDependente constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
