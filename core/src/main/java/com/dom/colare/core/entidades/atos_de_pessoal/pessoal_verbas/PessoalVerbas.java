
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_verbas;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


/**
 * pessoalVerbas
 * <p>
 * Dados das Verbas, seja remuneração ou descontos.
 * 
 */
@Entity
@Data
public class PessoalVerbas extends BaseEntityID {

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalLegislacao;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Nome da Verba, seja ela remuneração ou desconto.
     * (Required)
     * 
     */
    @NotNull
    private String nomeVerba;
    /**
     * Codigo do Vinculo por Tipo de Cargo
     * (Required)
     * 
     */
    @NotNull
    private Integer codVinculoTipoQuadroCargo;
    /**
     * Tipo de Verba
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoVerba;
    /**
     * Categoria Remuneracao
     * 
     */
    private Integer codCategoriaRemuneracao;
    /**
     * Categoria Desconto
     * 
     */
    private Integer codCategoriaDesconto;
    /**
     * Incidencia Previdenciaria
     * (Required)
     * 
     */
    @NotNull
    private Boolean incidenciaPrevidenciaria;
    /**
     * Verba Transitoria
     * (Required)
     * 
     */
    @NotNull
    private Boolean verbaTransitoria;
    /**
     * Natureza da Remuneracao
     * 
     */
    private Integer codNaturezaRemuneracao;
    /**
     * Natureza Desconto
     * 
     */
    private Integer codNaturezaDesconto;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * (Required)
     * 
     */
    @NotNull
    private String dataFinal;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * vinculoCargoEspecifico
     * <p>
     * Informa se a verba é vinculada a algum cargo em especifico.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "pessoal_verbas_id")
    private VinculoCargoEspecifico vinculoCargoEspecifico;
    /**
     * formaDeCalculo
     * <p>
     * Informar a Forma De Calculo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "pessoal_verbas_id")
    private FormaDeCalculo formaDeCalculo;
    /**
     * codificacaoNaturezaDespesa
     * <p>
     * Informa os Dados da Codificação Natureza Despesa
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "pessoal_verbas_id")
    private CodificacaoNaturezaDespesa codificacaoNaturezaDespesa;


}
