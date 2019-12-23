
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * item
 * <p>
 * Itens aderidos
 * 
 */
@Entity
@Data
public class Item extends BaseEntityID {

    /**
     * Número do Item
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroItem;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    public String descricao;
    /**
     * Código de Mercadoria ou Serviço dos itens
     * 
     */
    public Integer codigoUnicoMercadoriaOuServico;
    /**
     * Código da unidade medida
     * (Required)
     * 
     */
    @NotNull
    public Item.CodUnidadeMedida codUnidadeMedida;
    /**
     * Quantidade licitada
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double quantidadeLicitada;
    /**
     * Quantidade desdobrada (quantas unidades contém a caixa / fardo / pacote)
     * 
     */
    @DecimalMin("0")
    public Double quantidadeDesdobraUnidade;
    /**
     * Valor Unitário
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double valorUnitario;
    /**
     * Quantidade aderida
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    public Double quantidadeAderida;
    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    public Item.CodTipoDocumento codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    public String numeroDocumento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<CotacaoProprium> cotacaoPropria = null;

    public enum CodTipoDocumento {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoDocumento> CONSTANTS = new HashMap<Integer, CodTipoDocumento>();

        static {
            for (CodTipoDocumento c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoDocumento(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoDocumento fromValue(Integer value) {
            CodTipoDocumento constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodUnidadeMedida {

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
        _16(16);
        private final Integer value;
        private final static Map<Integer, CodUnidadeMedida> CONSTANTS = new HashMap<Integer, CodUnidadeMedida>();

        static {
            for (CodUnidadeMedida c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodUnidadeMedida(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodUnidadeMedida fromValue(Integer value) {
            CodUnidadeMedida constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
