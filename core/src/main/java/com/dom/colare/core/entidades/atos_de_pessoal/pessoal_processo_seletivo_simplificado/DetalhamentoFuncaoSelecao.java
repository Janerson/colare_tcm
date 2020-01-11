
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * detalhamentoFuncaoSelecao
 * <p>
 * Informa os Dados Detalhamento Função Seleção
 * 
 */
@Entity
@Data
public class DetalhamentoFuncaoSelecao extends BaseEntityID {

    /**
     * ID do Cargo 
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCargo;
    /**
     * Requisitos do Cargo no Edital
     * (Required)
     * 
     */
    @NotNull
    private String requisitosCargoEdital;
    /**
     * Quantidade de Vagas Ampla Concorrência
     * (Required)
     * 
     */
    @NotNull
    private Integer qtdVagasAmplaConcorrencia;
    /**
     * Quantidade de Vagas Cadastro de Reserva
     * (Required)
     * 
     */
    @NotNull
    private Integer qtdVagasCadastroReserva;
    /**
     * Quantidade de Vagas Cotas
     * (Required)
     * 
     */
    @NotNull
    private Integer qtdVagasCotas;
    /**
     * Quantidade de Vagas destinadas a PCD.
     * (Required)
     * 
     */
    @NotNull
    private Integer qtdPcD;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "detalhamento_funcao_id")
    private Set<DetalhamentoProva> detalhamentoProva = new HashSet<>();

}
