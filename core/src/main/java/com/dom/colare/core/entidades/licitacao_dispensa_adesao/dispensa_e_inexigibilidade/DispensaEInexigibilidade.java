
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * dispensaEInexigibilidade
 * <p>
 * Dispensas e inexigibilidades de procedimentos licitatórios
 * 
 */
@Entity(name = "DISPENSA_INEXIG")
@Data
public class DispensaEInexigibilidade extends BaseEntityID {

    /**
     * Exercício do Processo de Dispensa
     * (Required)
     * 
     */
    @DecimalMin("2010")
    @DecimalMax("2050")
    @NotNull
    private Integer exercicioProcesso;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    private String numeroProcessoAdministrativo;
    /**
     * Tipo do processo de Dispensa
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoProcesso;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    private Integer codNaturezaObjeto;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    private String idDocumentoPDF;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer idUnidadeGestora;
    /**
     * ID da remessa de Licitação-Fase2 fracassada
     * 
     */
    @DecimalMin("1")
    private Integer idFase2DesertaFracassada;
    /**
     * Data de início do processo de dispensa
     * (Required)
     * 
     */
    @NotNull
    private String dataInicioProcessoDispensa;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    private String descricaoNaturezaObjetoOutros;
    /**
     * Trata-se de prestação de serviço a ser executado de forma contínua.
     * (Required)
     * 
     */
    @NotNull
    private Boolean servicoContinuo;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<PublicacaoDispensa> publicacao = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<ItemDispensa> item = new HashSet<>();

    /**
    @Valid
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<FornecedorContratado> fornecedorContratado = new HashSet<>();**/
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<ResponsavelDispensa> responsaveis = new HashSet<>();


    @Valid
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<RecursoOrcamentarioDispensa> recursoOrcamentario = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<ParecerDispensa> parecer = new HashSet<>();


    @Valid
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<EditalEAnexosDispensa> editalEAnexo = new HashSet<>();

    /**
     *
     * (Required)
     *
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "DISPENSA_INEXIG_ID")
    private Set<NaturezaObjetoDetalhadaDispensa> naturezaObjetoDetalhadaDispensa = new HashSet<>();
}
