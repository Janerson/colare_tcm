
package com.dom.colare.core.entidades.atos_de_pessoal.pes_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * cargoDecorrenteDeTransformacao
 * <p>
 * Informar os dados dos cargos transformados
 * 
 */
@Entity(name = "PES_CARGO_TRANS")
@Data
public class CargoDecorrenteDeTransformacao extends BaseEntityID {

    /**
     * Informar se o cargo é decorrente de transformação
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoDecorrenteTransformacao;

    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGO_TRANS_ID")
    private Set<DadosDoCargoTransformado> dadosDoCargoTransformado = null;


}
