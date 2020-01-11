
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalAdmissao
 * <p>
 * Dados da Admissão
 * 
 */
@Entity
@Data
public class PessoalAdmissao extends BaseEntityID {

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
    private Integer codTipoEnvio;
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
    @OneToMany
    @JoinColumn(name = "pessoal_admissao_id")
    private Set<DocumentoPosse> documentoPosse = new HashSet<>();
    /**
     * nomeacaosubjudice
     * <p>
     * Informar os dados de nomeação Sub Judice
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "pessoal_admissao_id")
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
    @OneToOne
    @JoinColumn(name = "pessoal_admissao_id")
    private AcumulacaoDeCargos acumulacaoDeCargos;

    @Valid
    @OneToMany
    @JoinColumn(name = "pessoal_admissao_id")
    private Set<DetalhamentoAdmissaoTemporarioSemProcessoSeletivo> detalhamentoAdmissaoTemporarioSemProcessoSeletivo
            = new HashSet<>();
    /**
     * vinculoAdmissao
     * <p>
     * Informar o Vinculo da Admissão
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "pessoal_admissao_id")
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
    @OneToOne
    @JoinColumn(name = "pessoal_admissao_id")
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
    @OneToOne
    @JoinColumn(name = "pessoal_admissao_id")
    private DeclaracaoNepotismo declaracaoNepotismo;


}
