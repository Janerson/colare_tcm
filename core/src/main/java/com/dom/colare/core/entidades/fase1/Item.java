
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.Map;


/**
 * item
 * <p>
 * Cadastro de Itens do Processo Licitatório
 * 
 */
@Entity(name = "ITEM")
@Data
public class Item extends BaseEntityID {

    /**
     * Número do Item
     * (Required)
     * 
     */
    public Integer numeroItem;
    /**
     * Quantidade
     * (Required)
     * 
     */
    public Double quantidade;
    /**
     * Descrição
     * (Required)
     * 
     */
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
    public CodUnidadeMedida codUnidadeMedida;
    /**
     * Valor de referência
     * (Required)
     * 
     */
    public Double valorDeReferencia;
    /**
     * Indica se é o preço máximo
     * (Required)
     * 
     */
    public Boolean precoMaximo;
    /**
     * Código da origem do valor de referência
     * (Required)
     * 
     */
    public CodOrigemValorReferencia codOrigemValorReferencia;
    /**
     * Quantidade desdobrada (quantas unidades contém a caixa / fardo / pacote)
     * 
     */
    public Double quantidadeDesdobraUnidade;
    /**
     * Descreve onde foi obtido o valor de referência.
     * 
     */
    public String descricaoOrigemValorReferencia;

    public enum CodOrigemValorReferencia {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7),
        _9999(9999),
        _8(8);
        private final Integer value;
        private final static Map<Integer, CodOrigemValorReferencia> CONSTANTS = new HashMap<Integer, CodOrigemValorReferencia>();

        static {
            for (CodOrigemValorReferencia c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodOrigemValorReferencia(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodOrigemValorReferencia fromValue(Integer value) {
            CodOrigemValorReferencia constant = CONSTANTS.get(value);
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
