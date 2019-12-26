
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * cargoDecorrenteDeTransformacao
 * <p>
 * Informar os dados dos cargos transformados
 * 
 */
public class CargoDecorrenteDeTransformacao {

    /**
     * Informar se o cargo é decorrente de transformação
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoDecorrenteTransformacao;
    @Valid
    private Set<DadosDoCargoTransformado> dadosDoCargoTransformado = null;

    /**
     * Informar se o cargo é decorrente de transformação
     * (Required)
     * 
     */
    public Boolean getCargoDecorrenteTransformacao() {
        return cargoDecorrenteTransformacao;
    }

    /**
     * Informar se o cargo é decorrente de transformação
     * (Required)
     * 
     */
    public void setCargoDecorrenteTransformacao(Boolean cargoDecorrenteTransformacao) {
        this.cargoDecorrenteTransformacao = cargoDecorrenteTransformacao;
    }

    public Set<DadosDoCargoTransformado> getDadosDoCargoTransformado() {
        return dadosDoCargoTransformado;
    }

    public void setDadosDoCargoTransformado(Set<DadosDoCargoTransformado> dadosDoCargoTransformado) {
        this.dadosDoCargoTransformado = dadosDoCargoTransformado;
    }

}
