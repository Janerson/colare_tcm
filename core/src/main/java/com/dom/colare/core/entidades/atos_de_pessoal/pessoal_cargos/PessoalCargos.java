
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * pessoalCargos
 * <p>
 * Dados dos Cargos do Município (A maioria dos cargos é vinculada somente à unidade gestora responsável pela administração do município, exceto cargos muito específicos de alguma unidade. Não confundir lotação do servidor com vinculação do cargo à unidade)
 * 
 */
@Entity(name = "PES_CARGOS")
@Data
public class PessoalCargos extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Tipo de Regime Jurídico
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoRegimeJuridico;
    /**
     * Tipo do Quadro de Pessoal
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoQuadroPessoal;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * Nome do Cargo
     * (Required)
     * 
     */
    @NotNull
    private String nomeCargo;
    /**
     * Quantitativo de Cargos
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer quantitativoCargo;
    /**
     * Classificação Brasileira Ocupações - CBO
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Integer classificacaoBrasileiraOcupacoes;
    /**
     * Descrição da Especialidade do Cargo
     * 
     */
    private String descricaoEspecialidade;
    /**
     * Escolaridade Mínima Exigida
     * (Required)
     * 
     */
    @NotNull
    private Integer escolaridadeMinima;
    /**
     * Informa se o cargo é acumulável
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoAcumulavel;
    /**
     * Informa se o cargo é estruturado em carreira
     * (Required)
     * 
     */
    @NotNull
    private Boolean cargoCarreira;
    /**
     * Informa a carga horária semanal
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Double cargaHorariaSemanal;
    /**
     * Informa o regime previdenciário de acordo com a tabela
     * (Required)
     * 
     */
    @NotNull
    private Integer regimePrevidenciario;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * cargoDecorrenteDeTransformacao
     * <p>
     * Informar os dados dos cargos transformados
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGO_TRANS_ID")
    private CargoDecorrenteDeTransformacao cargoDecorrenteDeTransformacao;
    /**
     * cargoEmExtincao
     * <p>
     * Informar se o cargo será extinto quando entrar em vacância.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGO_EXTIN_ID")
    private CargoEmExtincao cargoEmExtincao;
    /**
     * dedicacaoExclusiva
     * <p>
     * Informar se o cargo é de dedicação exclusiva
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_CARGO_DEDIC_ID")
    private DedicacaoExclusiva dedicacaoExclusiva;
    /**
     * detalhamentoDasAtribuicoesOuAtividades
     * <p>
     * Informar os dados das atribuições/atividades do cargo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_CARGO_ATRIB_ID")
    private DetalhamentoDasAtribuicoesOuAtividades detalhamentoDasAtribuicoesOuAtividades;
    /**
     * cargoDeOutroEnte
     * <p>
     * Informar se o cargo pertence a outro ente federado
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_CARGO_ENTE_ID")
    private CargoDeOutroEnte cargoDeOutroEnte;
    /**
     * requisitosDeProvimento
     * <p>
     * Informar os requisitos de provimento do cargo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGO_REQPR_ID")
    private RequisitosDeProvimento requisitosDeProvimento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CARGOS_ID")
    private Set<Classe> classe = null;


}
