
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
 * orgaoGerenciadorDaAdesao
 * <p>
 * Dados do Gerenciador da Adesão
 * 
 */
@Entity(name = "ORG_GER_ADESAO")
@Data
public class OrgaoGerenciadorDaAdesao extends BaseEntityID {

    /**
     * Código da esfera governamental do órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codEsferaOrgaoGerenciador;

    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String numeroDocumento;

    /**
     * Código IBGE do ente federativo ao qual pertence o órgão gerenciador
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String codIBGEEnteGerenciador;
    /**
     * Exercício do edital da licitação
     * (Required)
     * 
     */

    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    @Column
    private Integer exercicioLicitacao;

    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String numeroProcessoAdministrativo;

    /**
     * Modalidade da Licitação
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codModalidadeLicitacao;

    /**
     * Número da Licitação por modalidade
     * (Required)
     * 
     */
    @DecimalMin("1")
    @DecimalMax("500")
    @NotNull
    @Column
    private Integer numeroLicitacao;

    /**
     * Tipo de licitação
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Integer codTipoLicitacaoCriterioJulgamento;

    /**
     * Data da Ata de Registro de Preços
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataAtaRegistroPreco;

    /**
     * Data de validade
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String dataValidade;

    /**
     * Processo realizado por lote
     * (Required)
     * 
     */
    @NotNull
    @Column
    private Boolean processoPorLote;

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name ="ORG_GER_ADESAO_ID")
    private Set<LoteAdesaoRegistroPreco> loteAdesaoRegistroPreco = new HashSet<>();


}
