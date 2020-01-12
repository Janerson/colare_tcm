
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_privateo;

import com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico.*;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalEditalDeConcursoProcessoSeletivoPublico
 * <p>
 * Dados do Edital do Concurso ou Processo Seletivo Público
 * 
 */
@Entity
@Data
public class PessoalEditalDeConcursoProcessoSeletivoPublico extends BaseEntityID {

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
     * Número do Edital
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroEdital;
    /**
     * Ano do Edital
     * (Required)
     * 
     */
    @DecimalMin("1950")
    @NotNull
    private Integer anoEdital;
    /**
     * Informar o tipo do edital de Seleção de Pessoal, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEditalSelecaoPessoal;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "processo_seletivo_id")
    private Set<TextoDoEditalProcessoSeletivo> textoDoEdital = new HashSet<>();
    /**
     * solicitacaoConcurso
     * <p>
     * Informar a Solicitação Concurso, conforme Art. 7º, parágrafo único, I, a, da IN 10/15.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private SolicitacaoConcurso solicitacaoConcurso;
    /**
     * comissaoOrganizadoraSelecao
     * <p>
     * Comissão Organizadora da Seleção
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private ComissaoOrganizadoraSelecao comissaoOrganizadoraSelecao;
    /**
     * bancaExaminadoraOrganizadora
     * <p>
     * Informar Banca Examinadora Organizadora
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private BancaExaminadoraOrganizadora bancaExaminadoraOrganizadora;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "processo_seletivo_id")
    private Set<DetalhamentoPublicidadeExtratoEdital> detalhamentoPublicidadeExtratoEdital = new HashSet<>();
    /**
     * detalhesPcd
     * <p>
     * informar dados relativos a PCD
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private DetalhesPcd detalhesPcd;
    /**
     * cadastroReserva
     * <p>
     * Informar dados sobre cadastro de reserva.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private CadastroReserva cadastroReserva;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "processo_seletivo_id")
    private Set<DetalhamentoCargosSelecaoProva> detalhamentoCargosSelecaoProva = new HashSet<>();
    /**
     * criteriosDeDesempate
     * <p>
     * Informar os critérios de desempate.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "processo_seletivo_id")
    private CriteriosDeDesempate criteriosDeDesempate;
    /**
     * taxaDeInscricao
     * <p>
     * Informar as detalhamentos sobre a taxa de inscrição na Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private TaxaDeInscricao taxaDeInscricao;
    /**
     * periodoDeInscricao
     * <p>
     * Detalhamento do período de inscrição da Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private PeriodoDeInscricao periodoDeInscricao;
    /**
     * validade
     * <p>
     * Informar a dados da validade da Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private Validade validade;
    /**
     * dadosRecursoImpugnacao
     * <p>
     * Informa os dados sobre a recurso e impugnação dos atos e fases da seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private DadosRecursoImpugnacao dadosRecursoImpugnacao;
    /**
     * autorizacaoLdo
     * <p>
     * Informa dados da autorização na LDO para realização da Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private AutorizacaoLdo autorizacaoLdo;
    /**
     * certidaoResponsabilidadeFiscal
     * <p>
     * Informa a Certidão de Responsabilidade Fiscal
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "processo_seletivo_id")
    private CertidaoResponsabilidadeFiscal certidaoResponsabilidadeFiscal;



}
