
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalPensionista
 * <p>
 * Dados de Pensionista
 * 
 */
public class PessoalPensionista {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalPensionista.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Informa o Tipo de Pensão, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public PessoalPensionista.CodTipoPensao codTipoPensao;
    /**
     * Informa se a pessoa era pensionista antes do exercício do 2020, ou seja, se ela foi informada ao TCMGO antes do COLARE PESSOAL. 
     * (Required)
     * 
     */
    @NotNull
    public Boolean pensionistaAnterior2020;
    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalLegislacao;
    /**
     * dadosDaPensao
     * <p>
     * Informa os dados da instituição Pensão de servidores anteriores a 2020.
     * 
     */
    @Valid
    public DadosDaPensao dadosDaPensao;
    /**
     * pensaoRpps
     * <p>
     * Contém as informações sobre os pensionistas RPPS, (exceto Judicial e Merce)
     * 
     */
    @Valid
    public PensaoRpps pensaoRpps;
    /**
     * pensaoJudicial
     * <p>
     * Contém os dados das Pensões Judiciais.
     * 
     */
    @Valid
    public PensaoJudicial pensaoJudicial;
    /**
     * pensaoMerce
     * <p>
     * Contem as informações Pensão Mercê.
     * 
     */
    @Valid
    public PensaoMerce pensaoMerce;
    /**
     * requisitosFinanceiros
     * <p>
     * Contém os dados dos proventos do pensionista.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public RequisitosFinanceiros requisitosFinanceiros;

    public enum CodTipoEnvio {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoEnvio> CONSTANTS = new HashMap<Integer, CodTipoEnvio>();

        static {
            for (CodTipoEnvio c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnvio(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnvio fromValue(Integer value) {
            CodTipoEnvio constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoPensao {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoPensao> CONSTANTS = new HashMap<Integer, CodTipoPensao>();

        static {
            for (CodTipoPensao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoPensao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoPensao fromValue(Integer value) {
            CodTipoPensao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
