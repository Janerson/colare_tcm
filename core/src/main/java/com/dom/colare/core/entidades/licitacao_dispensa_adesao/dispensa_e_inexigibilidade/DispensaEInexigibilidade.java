
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
@Entity
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
    public Integer exercicioProcesso;
    /**
     * Número do Processo Administrativo
     * (Required)
     * 
     */
    @NotNull
    public String numeroProcessoAdministrativo;
    /**
     * Tipo do processo de Dispensa
     * (Required)
     * 
     */
    @NotNull
    public Integer codTipoProcesso;
    /**
     * Código da Natureza do Objeto
     * (Required)
     * 
     */
    @NotNull
    public Integer codNaturezaObjeto;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public Integer codTipoEnvio;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    public String idDocumentoPDF;
    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer idUnidadeGestora;
    /**
     * ID da remessa de Licitação-Fase2 fracassada
     * 
     */
    @DecimalMin("1")
    public Integer idFase2DesertaFracassada;
    /**
     * Data de início do processo de dispensa
     * (Required)
     * 
     */
    @NotNull
    public String dataInicioProcessoDispensa;
    /**
     * Descrição da natureza do objeto quando for selecionado a Natureza do objeto = Outros
     * 
     */
    public String descricaoNaturezaObjetoOutros;
    /**
     * Trata-se de prestação de serviço a ser executado de forma contínua.
     * (Required)
     * 
     */
    @NotNull
    public Boolean servicoContinuo;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "dispensa_id")
    public Set<PublicacaoDispensa> publicacao = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "dispensa_id")
    public Set<ItemDispensa> item = new HashSet<>();


    @Valid
    @OneToMany
    @JoinColumn(name = "dispensa_id")
    public Set<FornecedorContratado> fornecedorContratado = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name ="dispensa_id")
    public Set<ResponsavelDispensa> responsaveis = new HashSet<>();


    @Valid
    @OneToMany
    @JoinColumn(name ="dispensa_id")
    public Set<RecursoOrcamentarioDispensa> recursoOrcamentario = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name ="dispensa_id")
    public Set<ParecerDispensa> parecer = new HashSet<>();

}
