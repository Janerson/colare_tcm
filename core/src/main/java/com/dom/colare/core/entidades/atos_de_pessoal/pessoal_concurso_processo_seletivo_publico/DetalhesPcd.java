
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * detalhesPcd
 * <p>
 * informar dados relativos a PCD
 * 
 */
@Entity(name = "PES_CON_PCD")
@Data
public class DetalhesPcd extends BaseEntityID {

    /**
     * Existe Legislação Municipal para Reserva de Vagas para PCD.
     * (Required)
     * 
     */
    @NotNull
    private Boolean existeLegislacaoMunicipalReservaVagasPCD;
    /**
     * Existe Clausula de Arredondamento de Percentual para numero vagas PCD
     * (Required)
     * 
     */
    @NotNull
    private Boolean existeClausulaDeArreddondamentoDePercentual;
    /**
     * Existe Vagas Destinadas a PCD.
     * (Required)
     * 
     */
    @NotNull
    private Boolean haVagasDestinadasPCD;
   
    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_PCD_ID")
    private Set<DetalhamentoLeiPcd> detalhamentoLeiPcd = null;
  
    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_PCD_ID")
    private Set<DetalhamentoArredondamentoPcd> detalhamentoArredondamentoPcd = null;
  
    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_PCD_ID")
    private Set<DetalhamentoVagasPcd> detalhamentoVagasPcd = null;

}
