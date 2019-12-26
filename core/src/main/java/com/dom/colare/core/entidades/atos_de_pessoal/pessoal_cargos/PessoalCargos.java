
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_cargos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalCargos
 * <p>
 * Dados dos Cargos do Município (A maioria dos cargos é vinculada somente à unidade gestora responsável pela administração do município, exceto cargos muito específicos de alguma unidade. Não confundir lotação do servidor com vinculação do cargo à unidade)
 * 
 */
public class PessoalCargos {

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
    private PessoalCargos.CodTipoRegimeJuridico codTipoRegimeJuridico;
    /**
     * Tipo do Quadro de Pessoal
     * (Required)
     * 
     */
    @NotNull
    private PessoalCargos.CodTipoQuadroPessoal codTipoQuadroPessoal;
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
    private PessoalCargos.EscolaridadeMinima escolaridadeMinima;
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
    private PessoalCargos.RegimePrevidenciario regimePrevidenciario;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private PessoalCargos.CodTipoEnvio codTipoEnvio;
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
    private RequisitosDeProvimento requisitosDeProvimento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<Classe> classe = null;

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    public Integer getIdPessoalLegislacao() {
        return idPessoalLegislacao;
    }

    /**
     * Identificação (ID) da legislação anteriormente enviada
     * (Required)
     * 
     */
    public void setIdPessoalLegislacao(Integer idPessoalLegislacao) {
        this.idPessoalLegislacao = idPessoalLegislacao;
    }

    /**
     * Tipo de Regime Jurídico
     * (Required)
     * 
     */
    public CodTipoRegimeJuridico getCodTipoRegimeJuridico() {
        return codTipoRegimeJuridico;
    }

    /**
     * Tipo de Regime Jurídico
     * (Required)
     * 
     */
    public void setCodTipoRegimeJuridico(CodTipoRegimeJuridico codTipoRegimeJuridico) {
        this.codTipoRegimeJuridico = codTipoRegimeJuridico;
    }

    /**
     * Tipo do Quadro de Pessoal
     * (Required)
     * 
     */
    public CodTipoQuadroPessoal getCodTipoQuadroPessoal() {
        return codTipoQuadroPessoal;
    }

    /**
     * Tipo do Quadro de Pessoal
     * (Required)
     * 
     */
    public void setCodTipoQuadroPessoal(CodTipoQuadroPessoal codTipoQuadroPessoal) {
        this.codTipoQuadroPessoal = codTipoQuadroPessoal;
    }

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public Integer getIdUnidadeGestora() {
        return idUnidadeGestora;
    }

    /**
     * ID da Unidade Gestora conforme cadastro no sistema Passaporte
     * (Required)
     * 
     */
    public void setIdUnidadeGestora(Integer idUnidadeGestora) {
        this.idUnidadeGestora = idUnidadeGestora;
    }

    /**
     * Nome do Cargo
     * (Required)
     * 
     */
    public String getNomeCargo() {
        return nomeCargo;
    }

    /**
     * Nome do Cargo
     * (Required)
     * 
     */
    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    /**
     * Quantitativo de Cargos
     * (Required)
     * 
     */
    public Integer getQuantitativoCargo() {
        return quantitativoCargo;
    }

    /**
     * Quantitativo de Cargos
     * (Required)
     * 
     */
    public void setQuantitativoCargo(Integer quantitativoCargo) {
        this.quantitativoCargo = quantitativoCargo;
    }

    /**
     * Classificação Brasileira Ocupações - CBO
     * (Required)
     * 
     */
    public Integer getClassificacaoBrasileiraOcupacoes() {
        return classificacaoBrasileiraOcupacoes;
    }

    /**
     * Classificação Brasileira Ocupações - CBO
     * (Required)
     * 
     */
    public void setClassificacaoBrasileiraOcupacoes(Integer classificacaoBrasileiraOcupacoes) {
        this.classificacaoBrasileiraOcupacoes = classificacaoBrasileiraOcupacoes;
    }

    /**
     * Descrição da Especialidade do Cargo
     * 
     */
    public String getDescricaoEspecialidade() {
        return descricaoEspecialidade;
    }

    /**
     * Descrição da Especialidade do Cargo
     * 
     */
    public void setDescricaoEspecialidade(String descricaoEspecialidade) {
        this.descricaoEspecialidade = descricaoEspecialidade;
    }

    /**
     * Escolaridade Mínima Exigida
     * (Required)
     * 
     */
    public EscolaridadeMinima getEscolaridadeMinima() {
        return escolaridadeMinima;
    }

    /**
     * Escolaridade Mínima Exigida
     * (Required)
     * 
     */
    public void setEscolaridadeMinima(EscolaridadeMinima escolaridadeMinima) {
        this.escolaridadeMinima = escolaridadeMinima;
    }

    /**
     * Informa se o cargo é acumulável
     * (Required)
     * 
     */
    public Boolean getCargoAcumulavel() {
        return cargoAcumulavel;
    }

    /**
     * Informa se o cargo é acumulável
     * (Required)
     * 
     */
    public void setCargoAcumulavel(Boolean cargoAcumulavel) {
        this.cargoAcumulavel = cargoAcumulavel;
    }

    /**
     * Informa se o cargo é estruturado em carreira
     * (Required)
     * 
     */
    public Boolean getCargoCarreira() {
        return cargoCarreira;
    }

    /**
     * Informa se o cargo é estruturado em carreira
     * (Required)
     * 
     */
    public void setCargoCarreira(Boolean cargoCarreira) {
        this.cargoCarreira = cargoCarreira;
    }

    /**
     * Informa a carga horária semanal
     * (Required)
     * 
     */
    public Double getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    /**
     * Informa a carga horária semanal
     * (Required)
     * 
     */
    public void setCargaHorariaSemanal(Double cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    /**
     * Informa o regime previdenciário de acordo com a tabela
     * (Required)
     * 
     */
    public RegimePrevidenciario getRegimePrevidenciario() {
        return regimePrevidenciario;
    }

    /**
     * Informa o regime previdenciário de acordo com a tabela
     * (Required)
     * 
     */
    public void setRegimePrevidenciario(RegimePrevidenciario regimePrevidenciario) {
        this.regimePrevidenciario = regimePrevidenciario;
    }

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public CodTipoEnvio getCodTipoEnvio() {
        return codTipoEnvio;
    }

    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    public void setCodTipoEnvio(CodTipoEnvio codTipoEnvio) {
        this.codTipoEnvio = codTipoEnvio;
    }

    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String getMotivoAtualizacaoCorrecao() {
        return motivoAtualizacaoCorrecao;
    }

    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public void setMotivoAtualizacaoCorrecao(String motivoAtualizacaoCorrecao) {
        this.motivoAtualizacaoCorrecao = motivoAtualizacaoCorrecao;
    }

    /**
     * cargoDecorrenteDeTransformacao
     * <p>
     * Informar os dados dos cargos transformados
     * (Required)
     * 
     */
    public CargoDecorrenteDeTransformacao getCargoDecorrenteDeTransformacao() {
        return cargoDecorrenteDeTransformacao;
    }

    /**
     * cargoDecorrenteDeTransformacao
     * <p>
     * Informar os dados dos cargos transformados
     * (Required)
     * 
     */
    public void setCargoDecorrenteDeTransformacao(CargoDecorrenteDeTransformacao cargoDecorrenteDeTransformacao) {
        this.cargoDecorrenteDeTransformacao = cargoDecorrenteDeTransformacao;
    }

    /**
     * cargoEmExtincao
     * <p>
     * Informar se o cargo será extinto quando entrar em vacância.
     * (Required)
     * 
     */
    public CargoEmExtincao getCargoEmExtincao() {
        return cargoEmExtincao;
    }

    /**
     * cargoEmExtincao
     * <p>
     * Informar se o cargo será extinto quando entrar em vacância.
     * (Required)
     * 
     */
    public void setCargoEmExtincao(CargoEmExtincao cargoEmExtincao) {
        this.cargoEmExtincao = cargoEmExtincao;
    }

    /**
     * dedicacaoExclusiva
     * <p>
     * Informar se o cargo é de dedicação exclusiva
     * (Required)
     * 
     */
    public DedicacaoExclusiva getDedicacaoExclusiva() {
        return dedicacaoExclusiva;
    }

    /**
     * dedicacaoExclusiva
     * <p>
     * Informar se o cargo é de dedicação exclusiva
     * (Required)
     * 
     */
    public void setDedicacaoExclusiva(DedicacaoExclusiva dedicacaoExclusiva) {
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    /**
     * detalhamentoDasAtribuicoesOuAtividades
     * <p>
     * Informar os dados das atribuições/atividades do cargo
     * (Required)
     * 
     */
    public DetalhamentoDasAtribuicoesOuAtividades getDetalhamentoDasAtribuicoesOuAtividades() {
        return detalhamentoDasAtribuicoesOuAtividades;
    }

    /**
     * detalhamentoDasAtribuicoesOuAtividades
     * <p>
     * Informar os dados das atribuições/atividades do cargo
     * (Required)
     * 
     */
    public void setDetalhamentoDasAtribuicoesOuAtividades(DetalhamentoDasAtribuicoesOuAtividades detalhamentoDasAtribuicoesOuAtividades) {
        this.detalhamentoDasAtribuicoesOuAtividades = detalhamentoDasAtribuicoesOuAtividades;
    }

    /**
     * cargoDeOutroEnte
     * <p>
     * Informar se o cargo pertence a outro ente federado
     * (Required)
     * 
     */
    public CargoDeOutroEnte getCargoDeOutroEnte() {
        return cargoDeOutroEnte;
    }

    /**
     * cargoDeOutroEnte
     * <p>
     * Informar se o cargo pertence a outro ente federado
     * (Required)
     * 
     */
    public void setCargoDeOutroEnte(CargoDeOutroEnte cargoDeOutroEnte) {
        this.cargoDeOutroEnte = cargoDeOutroEnte;
    }

    /**
     * requisitosDeProvimento
     * <p>
     * Informar os requisitos de provimento do cargo
     * (Required)
     * 
     */
    public RequisitosDeProvimento getRequisitosDeProvimento() {
        return requisitosDeProvimento;
    }

    /**
     * requisitosDeProvimento
     * <p>
     * Informar os requisitos de provimento do cargo
     * (Required)
     * 
     */
    public void setRequisitosDeProvimento(RequisitosDeProvimento requisitosDeProvimento) {
        this.requisitosDeProvimento = requisitosDeProvimento;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Set<Classe> getClasse() {
        return classe;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setClasse(Set<Classe> classe) {
        this.classe = classe;
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

    public enum CodTipoQuadroPessoal {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7);
        private final Integer value;
        private final static Map<Integer, CodTipoQuadroPessoal> CONSTANTS = new HashMap<Integer, CodTipoQuadroPessoal>();

        static {
            for (CodTipoQuadroPessoal c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoQuadroPessoal(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoQuadroPessoal fromValue(Integer value) {
            CodTipoQuadroPessoal constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum CodTipoRegimeJuridico {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, CodTipoRegimeJuridico> CONSTANTS = new HashMap<Integer, CodTipoRegimeJuridico>();

        static {
            for (CodTipoRegimeJuridico c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CodTipoRegimeJuridico(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CodTipoRegimeJuridico fromValue(Integer value) {
            CodTipoRegimeJuridico constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum EscolaridadeMinima {

        _1(1),
        _2(2),
        _3(3),
        _4(4),
        _5(5),
        _6(6),
        _7(7);
        private final Integer value;
        private final static Map<Integer, EscolaridadeMinima> CONSTANTS = new HashMap<Integer, EscolaridadeMinima>();

        static {
            for (EscolaridadeMinima c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private EscolaridadeMinima(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static EscolaridadeMinima fromValue(Integer value) {
            EscolaridadeMinima constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum RegimePrevidenciario {

        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, RegimePrevidenciario> CONSTANTS = new HashMap<Integer, RegimePrevidenciario>();

        static {
            for (RegimePrevidenciario c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RegimePrevidenciario(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static RegimePrevidenciario fromValue(Integer value) {
            RegimePrevidenciario constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
