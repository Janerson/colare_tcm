
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * pessoalAdmissao
 * <p>
 * Dados da Admissão
 * 
 */
public class PessoalAdmissao {

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalCadastro;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private PessoalAdmissao.CodTipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    private String motivoAtualizacaoCorrecao;
    /**
     * Numero do Decreto de Nomeação
     * (Required)
     * 
     */
    @NotNull
    private String numeroDecretoNomeacao;
    /**
     * Data do Decreto de Nomeação
     * (Required)
     * 
     */
    @NotNull
    private String dataDecretoNomeacao;
    /**
     * Data da Nomeação
     * (Required)
     * 
     */
    @NotNull
    private String dataNomeacao;
    /**
     * Data da Posse (Admissão)
     * (Required)
     * 
     */
    @NotNull
    private String dataPosseAdmissao;
    /**
     * Data em que o servidor entrou no efetivo exercício
     * (Required)
     * 
     */
    @NotNull
    private String dataEfetivoExercicio;
    /**
     * Temporario sem ingresso por Processo Seletivo
     * 
     */
    private Boolean temporarioSemProcSeletivo;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<DocumentoPosse> documentoPosse = null;
    /**
     * nomeacaosubjudice
     * <p>
     * Informar os dados de nomeação Sub Judice
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private Nomeacaosubjudice nomeacaosubjudice;
    /**
     * acumulacaoDeCargos
     * <p>
     * Informar Acumulação de Cargo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private AcumulacaoDeCargos acumulacaoDeCargos;
    @Valid
    private Set<DetalhamentoAdmissaoTemporarioSemProcessoSeletivo> detalhamentoAdmissaoTemporarioSemProcessoSeletivo = null;
    /**
     * vinculoAdmissao
     * <p>
     * Informar o Vinculo da Admissão
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private VinculoAdmissao vinculoAdmissao;
    /**
     * dadosDaAdmissao
     * <p>
     * informar dados da admissão de acordo com o período
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private DadosDaAdmissao dadosDaAdmissao;
    /**
     * declaracaoNepotismo
     * <p>
     * Informa se o servidor enquadra-se em situação de nepotismo no ato da posse, conforme Sumula nº 13 do STF. 
     * (Required)
     * 
     */
    @Valid
    @NotNull
    private DeclaracaoNepotismo declaracaoNepotismo;

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    public Integer getIdPessoalCadastro() {
        return idPessoalCadastro;
    }

    /**
     * ID do Cadastro Pessoal
     * (Required)
     * 
     */
    public void setIdPessoalCadastro(Integer idPessoalCadastro) {
        this.idPessoalCadastro = idPessoalCadastro;
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
     * Numero do Decreto de Nomeação
     * (Required)
     * 
     */
    public String getNumeroDecretoNomeacao() {
        return numeroDecretoNomeacao;
    }

    /**
     * Numero do Decreto de Nomeação
     * (Required)
     * 
     */
    public void setNumeroDecretoNomeacao(String numeroDecretoNomeacao) {
        this.numeroDecretoNomeacao = numeroDecretoNomeacao;
    }

    /**
     * Data do Decreto de Nomeação
     * (Required)
     * 
     */
    public String getDataDecretoNomeacao() {
        return dataDecretoNomeacao;
    }

    /**
     * Data do Decreto de Nomeação
     * (Required)
     * 
     */
    public void setDataDecretoNomeacao(String dataDecretoNomeacao) {
        this.dataDecretoNomeacao = dataDecretoNomeacao;
    }

    /**
     * Data da Nomeação
     * (Required)
     * 
     */
    public String getDataNomeacao() {
        return dataNomeacao;
    }

    /**
     * Data da Nomeação
     * (Required)
     * 
     */
    public void setDataNomeacao(String dataNomeacao) {
        this.dataNomeacao = dataNomeacao;
    }

    /**
     * Data da Posse (Admissão)
     * (Required)
     * 
     */
    public String getDataPosseAdmissao() {
        return dataPosseAdmissao;
    }

    /**
     * Data da Posse (Admissão)
     * (Required)
     * 
     */
    public void setDataPosseAdmissao(String dataPosseAdmissao) {
        this.dataPosseAdmissao = dataPosseAdmissao;
    }

    /**
     * Data em que o servidor entrou no efetivo exercício
     * (Required)
     * 
     */
    public String getDataEfetivoExercicio() {
        return dataEfetivoExercicio;
    }

    /**
     * Data em que o servidor entrou no efetivo exercício
     * (Required)
     * 
     */
    public void setDataEfetivoExercicio(String dataEfetivoExercicio) {
        this.dataEfetivoExercicio = dataEfetivoExercicio;
    }

    /**
     * Temporario sem ingresso por Processo Seletivo
     * 
     */
    public Boolean getTemporarioSemProcSeletivo() {
        return temporarioSemProcSeletivo;
    }

    /**
     * Temporario sem ingresso por Processo Seletivo
     * 
     */
    public void setTemporarioSemProcSeletivo(Boolean temporarioSemProcSeletivo) {
        this.temporarioSemProcSeletivo = temporarioSemProcSeletivo;
    }

    /**
     * 
     * (Required)
     * 
     */
    public Set<DocumentoPosse> getDocumentoPosse() {
        return documentoPosse;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setDocumentoPosse(Set<DocumentoPosse> documentoPosse) {
        this.documentoPosse = documentoPosse;
    }

    /**
     * nomeacaosubjudice
     * <p>
     * Informar os dados de nomeação Sub Judice
     * (Required)
     * 
     */
    public Nomeacaosubjudice getNomeacaosubjudice() {
        return nomeacaosubjudice;
    }

    /**
     * nomeacaosubjudice
     * <p>
     * Informar os dados de nomeação Sub Judice
     * (Required)
     * 
     */
    public void setNomeacaosubjudice(Nomeacaosubjudice nomeacaosubjudice) {
        this.nomeacaosubjudice = nomeacaosubjudice;
    }

    /**
     * acumulacaoDeCargos
     * <p>
     * Informar Acumulação de Cargo
     * (Required)
     * 
     */
    public AcumulacaoDeCargos getAcumulacaoDeCargos() {
        return acumulacaoDeCargos;
    }

    /**
     * acumulacaoDeCargos
     * <p>
     * Informar Acumulação de Cargo
     * (Required)
     * 
     */
    public void setAcumulacaoDeCargos(AcumulacaoDeCargos acumulacaoDeCargos) {
        this.acumulacaoDeCargos = acumulacaoDeCargos;
    }

    public Set<DetalhamentoAdmissaoTemporarioSemProcessoSeletivo> getDetalhamentoAdmissaoTemporarioSemProcessoSeletivo() {
        return detalhamentoAdmissaoTemporarioSemProcessoSeletivo;
    }

    public void setDetalhamentoAdmissaoTemporarioSemProcessoSeletivo(Set<DetalhamentoAdmissaoTemporarioSemProcessoSeletivo> detalhamentoAdmissaoTemporarioSemProcessoSeletivo) {
        this.detalhamentoAdmissaoTemporarioSemProcessoSeletivo = detalhamentoAdmissaoTemporarioSemProcessoSeletivo;
    }

    /**
     * vinculoAdmissao
     * <p>
     * Informar o Vinculo da Admissão
     * (Required)
     * 
     */
    public VinculoAdmissao getVinculoAdmissao() {
        return vinculoAdmissao;
    }

    /**
     * vinculoAdmissao
     * <p>
     * Informar o Vinculo da Admissão
     * (Required)
     * 
     */
    public void setVinculoAdmissao(VinculoAdmissao vinculoAdmissao) {
        this.vinculoAdmissao = vinculoAdmissao;
    }

    /**
     * dadosDaAdmissao
     * <p>
     * informar dados da admissão de acordo com o período
     * (Required)
     * 
     */
    public DadosDaAdmissao getDadosDaAdmissao() {
        return dadosDaAdmissao;
    }

    /**
     * dadosDaAdmissao
     * <p>
     * informar dados da admissão de acordo com o período
     * (Required)
     * 
     */
    public void setDadosDaAdmissao(DadosDaAdmissao dadosDaAdmissao) {
        this.dadosDaAdmissao = dadosDaAdmissao;
    }

    /**
     * declaracaoNepotismo
     * <p>
     * Informa se o servidor enquadra-se em situação de nepotismo no ato da posse, conforme Sumula nº 13 do STF. 
     * (Required)
     * 
     */
    public DeclaracaoNepotismo getDeclaracaoNepotismo() {
        return declaracaoNepotismo;
    }

    /**
     * declaracaoNepotismo
     * <p>
     * Informa se o servidor enquadra-se em situação de nepotismo no ato da posse, conforme Sumula nº 13 do STF. 
     * (Required)
     * 
     */
    public void setDeclaracaoNepotismo(DeclaracaoNepotismo declaracaoNepotismo) {
        this.declaracaoNepotismo = declaracaoNepotismo;
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
