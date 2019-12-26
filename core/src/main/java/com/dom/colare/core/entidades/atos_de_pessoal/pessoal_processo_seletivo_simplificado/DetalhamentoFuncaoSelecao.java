
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * detalhamentoFuncaoSelecao
 * <p>
 * Informa os Dados Detalhamento Função Seleção
 * 
 */
public class DetalhamentoFuncaoSelecao {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    public Integer idPessoalCargo;
    /**
     * Requisitos do Cargo no Edital
     * (Required)
     * 
     */
    @NotNull
    public String requisitosCargoEdital;
    /**
     * Quantidade de Vagas Ampla Concorrência
     * (Required)
     * 
     */
    @NotNull
    public Integer qtdVagasAmplaConcorrencia;
    /**
     * Quantidade de Vagas Cadastro de Reserva
     * (Required)
     * 
     */
    @NotNull
    public Integer qtdVagasCadastroReserva;
    /**
     * Quantidade de Vagas Cotas
     * (Required)
     * 
     */
    @NotNull
    public Integer qtdVagasCotas;
    /**
     * Quantidade de Vagas destinadas a PCD.
     * (Required)
     * 
     */
    @NotNull
    public Integer qtdPcD;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoProva> detalhamentoProva = null;

}
