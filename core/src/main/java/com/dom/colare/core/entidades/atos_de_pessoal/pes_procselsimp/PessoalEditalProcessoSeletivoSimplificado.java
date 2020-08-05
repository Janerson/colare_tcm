
package com.dom.colare.core.entidades.atos_de_pessoal.pes_procselsimp;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalEditalProcessoSeletivoSimplificado
 * <p>
 * Dados do Edital de Processo Seletivo Simplificado
 * 
 */
@Entity(name = "PES_PROCSELSIMP")
@Data
public class PessoalEditalProcessoSeletivoSimplificado extends BaseEntityID {

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
    @NotNull
    private Integer anoEdital;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_PROCSELSIMP_ID")
    private Set<TextoEditalSimplificado> textoEdital = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_PROCSELSIMP_ID")
    private Set<DetalhamentoExcepcionalInteressePublico> detalhamentoExcepcionalInteressePublico = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_PROCSELSIMP_ID")
    private Set<DetalhamentoPublicidadeExtratoEditalSeletivoSimplificado> detalhamentoPublicidadeExtratoEditalSeletivoSimplificado = new HashSet<>();
    /**
     * detalhamentoBancaExaminadora
     * <p>
     * Informa Detalhamento Banca Examinadora
     * (Required)
     * 
     */

    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_PSS_BANCA")
    private DetalhamentoBancaExaminadora detalhamentoBancaExaminadora;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_PROCSELSIMP_ID")
    private Set<DetalhamentoFuncaoSelecao> detalhamentoFuncaoSelecao = new HashSet<>();
    /**
     * validadeProcessoSeletivo
     * <p>
     * Informa Validade Processo Seletivo
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_PSS_VALID_ID")
    private ValidadeProcessoSeletivo validadeProcessoSeletivo;
    /**
     * duracaoMaximaContratos
     * <p>
     * Informa a Duracao Maxima dos Contratos
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_PSS_DURACAO_ID")
    private DuracaoMaximaContratos duracaoMaximaContratos;
    /**
     * periodoInscricaoConcurso
     * <p>
     * Informa Periodo Inscrição da Seleção
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_PSS_PRD_INS")
    private PeriodoInscricaoConcurso periodoInscricaoConcurso;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;
}
