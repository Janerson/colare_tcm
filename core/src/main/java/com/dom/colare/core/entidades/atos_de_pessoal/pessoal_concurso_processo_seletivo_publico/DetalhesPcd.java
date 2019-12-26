
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * detalhesPcd
 * <p>
 * informar dados relativos a PCD
 * 
 */
public class DetalhesPcd {

    /**
     * Existe Legislação Municipal para Reserva de Vagas para PCD.
     * (Required)
     * 
     */
    @NotNull
    public Boolean existeLegislacaoMunicipalReservaVagasPCD;
    /**
     * Existe Clausula de Arredondamento de Percentual para numero vagas PCD
     * (Required)
     * 
     */
    @NotNull
    public Boolean existeClausulaDeArreddondamentoDePercentual;
    /**
     * Existe Vagas Destinadas a PCD.
     * (Required)
     * 
     */
    @NotNull
    public Boolean haVagasDestinadasPCD;
    @Valid
    public Set<DetalhamentoLeiPcd> detalhamentoLeiPcd = null;
    @Valid
    public Set<DetalhamentoArredondamentoPcd> detalhamentoArredondamentoPcd = null;
    @Valid
    public Set<DetalhamentoVagasPcd> detalhamentoVagasPcd = null;

}
