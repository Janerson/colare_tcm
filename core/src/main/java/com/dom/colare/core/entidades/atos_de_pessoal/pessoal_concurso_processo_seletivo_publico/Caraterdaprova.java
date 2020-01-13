
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concurso_processo_seletivo_publico;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

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
    private Boolean haClausulaComAPontuacaoMinimaParaClassificacao;
    /**
     * Há clausula que estabeleça critérios de aprovação para nota final.
     * (Required)
     * 
     */
    @NotNull
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
