
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalEditalDeConcursoProcessoSeletivoPublico
 * <p>
 * Dados do Edital do Concurso ou Processo Seletivo Público
 * 
 */
public class PessoalEditalDeConcursoProcessoSeletivoPublico {

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public PessoalEditalDeConcursoProcessoSeletivoPublico.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    /**
     * Número do Edital
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    public Integer numeroEdital;
    /**
     * Ano do Edital
     * (Required)
     * 
     */
    @DecimalMin("1950")
    @NotNull
    public Integer anoEdital;
    /**
     * Informar o tipo do edital de Seleção de Pessoal, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public PessoalEditalDeConcursoProcessoSeletivoPublico.CodTipoEditalSelecaoPessoal codTipoEditalSelecaoPessoal;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<TextoDoEdital> textoDoEdital = null;
    /**
     * solicitacaoConcurso
     * <p>
     * Informar a Solicitação Concurso, conforme Art. 7º, parágrafo único, I, a, da IN 10/15.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public SolicitacaoConcurso solicitacaoConcurso;
    /**
     * comissaoOrganizadoraSelecao
     * <p>
     * Comissão Organizadora da Seleção
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public ComissaoOrganizadoraSelecao comissaoOrganizadoraSelecao;
    /**
     * bancaExaminadoraOrganizadora
     * <p>
     * Informar Banca Examinadora Organizadora
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public BancaExaminadoraOrganizadora bancaExaminadoraOrganizadora;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoPublicidadeExtratoEdital> detalhamentoPublicidadeExtratoEdital = null;
    /**
     * detalhesPcd
     * <p>
     * informar dados relativos a PCD
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DetalhesPcd detalhesPcd;
    /**
     * cadastroReserva
     * <p>
     * Informar dados sobre cadastro de reserva.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public CadastroReserva cadastroReserva;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<DetalhamentoCargosSelecaoProva> detalhamentoCargosSelecaoProva = null;
    /**
     * criteriosDeDesempate
     * <p>
     * Informar os critérios de desempate.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public CriteriosDeDesempate criteriosDeDesempate;
    /**
     * taxaDeInscricao
     * <p>
     * Informar as detalhamentos sobre a taxa de inscrição na Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public TaxaDeInscricao taxaDeInscricao;
    /**
     * periodoDeInscricao
     * <p>
     * Detalhamento do período de inscrição da Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public PeriodoDeInscricao periodoDeInscricao;
    /**
     * validade
     * <p>
     * Informar a dados da validade da Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public Validade validade;
    /**
     * dadosRecursoImpugnacao
     * <p>
     * Informa os dados sobre a recurso e impugnação dos atos e fases da seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public DadosRecursoImpugnacao dadosRecursoImpugnacao;
    /**
     * autorizacaoLdo
     * <p>
     * Informa dados da autorização na LDO para realização da Seleção.
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public AutorizacaoLdo autorizacaoLdo;
    /**
     * certidaoResponsabilidadeFiscal
     * <p>
     * Informa a Certidão de Responsabilidade Fiscal
     * (Required)
     * 
     */
    @Valid
    @NotNull
    public CertidaoResponsabilidadeFiscal certidaoResponsabilidadeFiscal;

    public enum CodTipoEditalSelecaoPessoal {

        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, CodTipoEditalSelecaoPessoal> CONSTANTS = new HashMap<Integer, CodTipoEditalSelecaoPessoal>();

        static {
            for (CodTipoEditalSelecaoPessoal c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEditalSelecaoPessoal(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEditalSelecaoPessoal fromValue(Integer value) {
            CodTipoEditalSelecaoPessoal constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoEnvio {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoEnvio> CONSTANTS = new HashMap<Integer, CodTipoEnvio>();

        static {
            for (CodTipoEnvio c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoEnvio(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoEnvio fromValue(Integer value) {
            CodTipoEnvio constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
