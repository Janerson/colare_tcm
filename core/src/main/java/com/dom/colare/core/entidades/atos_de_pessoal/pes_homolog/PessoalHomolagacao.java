
package com.dom.colare.core.entidades.atos_de_pessoal.pes_homolog;

import com.dom.colare.core.entidades.shared.Arquivo;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * pessoalHomologacao
 * <p>
 * Dados referentes às Homologações das Seleções (Concurso, processo Seletivo Público ou Simplificado)
 * 
 */
@Entity(name = "PES_HOMOLOG")
@Data
public class PessoalHomolagacao extends BaseEntityID {

    /**
     * Identifica o tipo de procedimento de Seleção de Pessoal, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codMetodoSelecaoPessoalUtilizado;
    /**
     * Identifica o ID do procedimento que decorre a Seleção de Pessoal (seja Concurso, PSP ou PSS)
     * (Required)
     * 
     */
    @NotNull
    private Integer idProcedimentoSelecaoPessoal;
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
     * Data da homologação
     * (Required)
     * 
     */
    @NotNull
    private String dataHomologacao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_HOMOLOG_ID")
    private Set<PublicacaoPessoalHomologacao> publicacaoPessoalHomologacao = null;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_HOMOLOG_ID")
    private Set<ListaClassificacaoCargo> listaClassificacaoCargo = null;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ARQUIVO_ID")
    private Arquivo arquivo;
}
