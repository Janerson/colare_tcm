
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;


/**
 * detalhamentoCargoDeOutroEnte
 * <p>
 * Informa o detalhamento do ente de origem do cargo
 * 
 */
public class DetalhamentoCargoDeOutroEnte {

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    @NotNull
    private DetalhamentoCargoDeOutroEnte.CodTipoEnte codTipoEnte;
    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    private String descricao;
    /**
     * Nome da Unidade Gestora de origem ao qual o cargo esta vinculado
     * (Required)
     * 
     */
    @NotNull
    private String unidadeGestoraOrigemCargo;

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    public CodTipoEnte getCodTipoEnte() {
        return codTipoEnte;
    }

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    public void setCodTipoEnte(CodTipoEnte codTipoEnte) {
        this.codTipoEnte = codTipoEnte;
    }

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
     * Nome da Unidade Gestora de origem ao qual o cargo esta vinculado
     * (Required)
     * 
     */
    public String getUnidadeGestoraOrigemCargo() {
        return unidadeGestoraOrigemCargo;
    }

    /**
     * Nome da Unidade Gestora de origem ao qual o cargo esta vinculado
     * (Required)
     * 
     */
    public void setUnidadeGestoraOrigemCargo(String unidadeGestoraOrigemCargo) {
        this.unidadeGestoraOrigemCargo = unidadeGestoraOrigemCargo;
    }

    public enum CodTipoEnte {

        _1(1),
        _2(2),
        _3(3),
        _4(4);
        private final Integer value;
        private final static Map<Integer, CodTipoEnte> CONSTANTS = new HashMap<Integer, CodTipoEnte>();

        static {
            for (CodTipoEnte c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnte(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnte fromValue(Integer value) {
            CodTipoEnte constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
