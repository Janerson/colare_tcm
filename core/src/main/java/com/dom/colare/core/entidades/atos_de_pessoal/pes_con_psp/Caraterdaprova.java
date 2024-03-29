
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * caraterdaprova
 * <p>
 * Informar detalhes sobre o caráter da prova e clausulas sobre pontuação da prova. 
 * 
 */
@Entity(name = "PES_CON_CARPROV")
@Data
public class Caraterdaprova extends BaseEntityID {

    /**
     * Caráter da prova, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoCaraterProva;
    /**
     * Há Clausula com a pontuação miníma para classificação.
     * (Required)
     * 
     */
    @NotNull
    @Column(name = "HA_PONTUACAO_MINIMA")
    private Boolean haClausulaComAPontuacaoMinimaParaClassificacao;
    /**
     * Há clausula que estabeleça critérios de aprovação para nota final.
     * (Required)
     * 
     */
    @NotNull
    @Column(name = "HA_CLAUSULA_CRI_APROV")
    private Boolean haClausulaQueEstabelecaCriteriosDeAprovacaoParaNotaFinal;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_CARPROV_ID")
    private Set<DetalhamentoClausulaComAPontuacaoMinimaParaClassificacao> detalhamentoClausulaComAPontuacaoMinimaParaClassificacao = null;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_CON_CARPROV_ID")
    private Set<DetalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal> detalhamentoClausulaQueEstabelecaCriteriosParaAprovacaoEParaNotaFinal = null;


}
