
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * adesaoARegistroDePrecos
 * <p>
 * Dados das adesões a registro de preços
 * 
 */
@Entity
@Data
public class AdesaoARegistroDePrecos extends BaseEntityID {

    /**
     * Exercício em que foi iniciado o procedimento de adesão
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    @Column
    private Integer exercicioAdesao;

    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String numeroProcessoAdministrativo;

    /**
     * Processo realizado por lote
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Boolean processoPorLote;

    /**
     * Tipo da adesão
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codTipoAdesao;

    /**
     * Data da privateação do aviso de intenção de adesão
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataPublicacaoAvisoIntencao;

    /**
     * Objeto
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String objeto;

    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codNaturezaObjeto;

    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    @Column
    private String descricaoNaturezaObjetoOutros;

    /**
     * Unidade de medida do prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codUnidadeMedidaPrazoExecucao;

    /**
     * Prazo para entrega do objeto ou execução do contrato
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Integer prazoExecucao;

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codTipoEnvio;

    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    @Column
    private String motivoAtualizacaoCorrecao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "adesaoARegistroDePrecos")
    private Set<DocumentoAdesaoRegistroDePrecos> documentoAdesaoRegistroDePrecos = null;
    /**
     * orgaoGerenciadorDaAdesao
     * <p>
     * Dados do Gerenciador da Adesão
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    private OrgaoGerenciadorDaAdesao orgaoGerenciadorDaAdesao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "adesaoARegistroDePrecos")
    private Set<PublicacaoAdesao> publicacao = new HashSet<>();

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "adesaoARegistroDePrecos")
    private Set<ResponsavelAdesao> responsaveis = new HashSet<>();

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "adesaoARegistroDePrecos")
    private Set<ParecerAdesao> parecerAdesao = new HashSet<>();

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "adesaoARegistroDePrecos")
    private Set<RecursoOrcamentarioAdesao> recursoOrcamentarioAdesao = new HashSet<>();

}
