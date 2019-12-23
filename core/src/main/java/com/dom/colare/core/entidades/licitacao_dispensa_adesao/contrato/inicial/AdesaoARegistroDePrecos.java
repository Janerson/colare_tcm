
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * adesaoARegistroDePrecos
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "3-Adesão a registro de preços", com os dados da adesão da qual resultou o contrato.
 * 
 */
public class AdesaoARegistroDePrecos {

    /**
     * Exercício em que foi iniciado o procedimento de adesão
     * (Required)
     * 
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    public Integer exercicioAdesao;
    /**
     * Código da esfera governamental do órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    public AdesaoARegistroDePrecos.CodEsferaOrgaoGerenciador codEsferaOrgaoGerenciador;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    public String numeroDocumento;
    /**
     * Código IBGE do ente federativo ao qual pertence o órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    public String codIBGEEnteGerenciador;
    /**
     * Data da Ata de Registro de Preços
     * (Required)
     * 
     */
    @NotNull
    public String dataAtaRegistroPreco;
    /**
     * Data de validade
     * (Required)
     * 
     */
    @NotNull
    public String dataValidade;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Documento> documentos = null;

    public enum CodEsferaOrgaoGerenciador {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodEsferaOrgaoGerenciador> CONSTANTS = new HashMap<Integer, CodEsferaOrgaoGerenciador>();

        static {
            for (CodEsferaOrgaoGerenciador c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodEsferaOrgaoGerenciador(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodEsferaOrgaoGerenciador fromValue(Integer value) {
            CodEsferaOrgaoGerenciador constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
