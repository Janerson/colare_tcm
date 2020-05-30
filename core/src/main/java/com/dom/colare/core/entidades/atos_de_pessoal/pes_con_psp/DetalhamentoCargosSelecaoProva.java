
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * detalhamentoCargosSelecaoProva
 * <p>
 * Informar os Cargos vagas e provas vinculados a eles.
 * 
 */
@Entity(name = "PES_CON_CARGPRO")
@Data
public class DetalhamentoCargosSelecaoProva extends BaseEntityID {

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
    @DecimalMin("0")
    @NotNull
    private Integer qtdVagasAmplaConcorrencia;
    /**
     * Quantidade de Vagas Cadastro de Reserva
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Integer qtdVagasCadastroReserva;
    /**
     * Quantidade de Vagas Cotas
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Integer qtdVagasCotas;
    /**
     * Quantidade de Vagas destinadas a PCD.
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Integer qtdPcD;
    /**
     * Carga Horária Semanal prevista Edital
     * (Required)
     * 
     */
    @NotNull
    private Integer cargaHorariaEdital;
    /**
     * Atribuições do cargo prevista no Edital.
     * (Required)
     * 
     */
    @NotNull
    private String atribuicoesEdital;
    /**
     * Caso o cargo seja ACS, O edital oferta de vagas por Micro áreas?
     * (Required)
     * 
     */
    @NotNull
    private Boolean ofertaVagasPorMicroAreasParaACS;
    /**
     * Exige Registro em algum Conselho ou Ordem Profissional.
     * (Required)
     * 
     */
    @NotNull
    private Boolean exigeRegistroConselhoOuOrdem;
    /**
     * Código Conselho o Ordem, conforme tabela.
     * 
     */
    private Integer codConselhoOrdem;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_CON_CARGPRO_ID")
    private Set<DetalhamentoProvaSeletivoPublico> detalhamentoProva = new HashSet<>();

}
