
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
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
 * Dados das adesões a registro de preços
 * 
 */
@Entity
@Data
public class AdesaoARegistroDePrecos extends BaseEntityID {

    /**
     * Exercício em que foi iniciado o procedimento de adesão
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    public Integer exercicioAdesao;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    public String numeroProcessoAdministrativo;
    /**
     * Processo realizado por lote
     * (Required)
     * 
     */
    @NotNull
    public Boolean processoPorLote;
    /**
     * Tipo da adesão
     * (Required)
     * 
     */
    @NotNull
    public AdesaoARegistroDePrecos.CodTipoAdesao codTipoAdesao;
    /**
     * Data da publicação do aviso de intenção de adesão
     * (Required)
     * 
     */
    @NotNull
    public String dataPublicacaoAvisoIntencao;
    /**
     * Objeto
     * (Required)
     * 
     */
    @NotNull
    public String objeto;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    public AdesaoARegistroDePrecos.CodNaturezaObjeto codNaturezaObjeto;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    public String descricaoNaturezaObjetoOutros;
    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    @NotNull
    public AdesaoARegistroDePrecos.CodUnidadeMedidaPrazoExecucao codUnidadeMedidaPrazoExecucao;
    /**
     * Prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Integer prazoExecucao;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public AdesaoARegistroDePrecos.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Documento> documentos = null;
    /**
     * orgaoGerenciadorDaAdesao
     * <p>
     * Dados do Gerenciador da Adesão
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public OrgaoGerenciadorDaAdesao orgaoGerenciadorDaAdesao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<PublicacaoAdesao> publicacao = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Responsavel> responsavels = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ParecerAdesao> parecerAdesao = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<RecursoOrcamentarioAdesao> recursoOrcamentarioAdesao = null;

    public enum CodNaturezaObjeto {

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
        _12(12),
        _13(13),
        _14(14),
        _15(15),
        _16(16),
        _17(17),
        _18(18),
        _19(19),
        _20(20),
        _21(21),
        _22(22),
        _23(23),
        _24(24),
        _25(25),
        _26(26),
        _27(27),
        _28(28),
        _29(29),
        _30(30),
        _31(31),
        _32(32),
        _33(33),
        _34(34),
        _35(35),
        _36(36),
        _37(37),
        _38(38),
        _39(39),
        _40(40),
        _41(41),
        _42(42),
        _43(43),
        _44(44),
        _45(45),
        _46(46),
        _47(47),
        _48(48),
        _9999(9999);
        private final Integer value;
        private final static Map<Integer, CodNaturezaObjeto> CONSTANTS = new HashMap<Integer, CodNaturezaObjeto>();

        static {
            for (CodNaturezaObjeto c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodNaturezaObjeto(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodNaturezaObjeto fromValue(Integer value) {
            CodNaturezaObjeto constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoAdesao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoAdesao> CONSTANTS = new HashMap<Integer, CodTipoAdesao>();

        static {
            for (CodTipoAdesao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoAdesao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoAdesao fromValue(Integer value) {
            CodTipoAdesao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

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

    public enum CodUnidadeMedidaPrazoExecucao {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodUnidadeMedidaPrazoExecucao> CONSTANTS = new HashMap<Integer, CodUnidadeMedidaPrazoExecucao>();

        static {
            for (CodUnidadeMedidaPrazoExecucao c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodUnidadeMedidaPrazoExecucao(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodUnidadeMedidaPrazoExecucao fromValue(Integer value) {
            CodUnidadeMedidaPrazoExecucao constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
