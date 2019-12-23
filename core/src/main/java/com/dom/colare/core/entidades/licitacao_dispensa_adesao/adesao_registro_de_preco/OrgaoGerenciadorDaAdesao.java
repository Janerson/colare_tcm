
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * orgaoGerenciadorDaAdesao
 * <p>
 * Dados do Gerenciador da Adesão
 * 
 */
public class OrgaoGerenciadorDaAdesao {

    /**
     * Código da esfera governamental do órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    public OrgaoGerenciadorDaAdesao.CodEsferaOrgaoGerenciador codEsferaOrgaoGerenciador;
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
     * Exercício do edital da licitação
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    public Integer exercicioLicitacao;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    public String numeroProcessoAdministrativo;
    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    @NotNull
    public OrgaoGerenciadorDaAdesao.CodModalidadeLicitacao codModalidadeLicitacao;
    /**
     * Número da Licitação por modalidade
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull
    public Integer numeroLicitacao;
    /**
     * Tipo de licitação
     * (Required)
     * 
     */
    @NotNull
    public OrgaoGerenciadorDaAdesao.CodTipoLicitacaoCriterioJulgamento codTipoLicitacaoCriterioJulgamento;
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
     * Processo realizado por lote
     * (Required)
     * 
     */
    @NotNull
    public Boolean processoPorLote;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Lote> lote = null;

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

    public enum CodModalidadeLicitacao {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8);
        private final Integer value;
        private final static Map<Integer, CodModalidadeLicitacao> CONSTANTS = new HashMap<Integer, CodModalidadeLicitacao>();

        static {
            for (CodModalidadeLicitacao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodModalidadeLicitacao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodModalidadeLicitacao fromValue(Integer value) {
            CodModalidadeLicitacao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoLicitacaoCriterioJulgamento {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _8(8),
        _9(9),
        _10(10);
        private final Integer value;
        private final static Map<Integer, CodTipoLicitacaoCriterioJulgamento> CONSTANTS = new HashMap<Integer, CodTipoLicitacaoCriterioJulgamento>();

        static {
            for (CodTipoLicitacaoCriterioJulgamento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoLicitacaoCriterioJulgamento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoLicitacaoCriterioJulgamento fromValue(Integer value) {
            CodTipoLicitacaoCriterioJulgamento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
