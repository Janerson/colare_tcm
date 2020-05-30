
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * licitacaoFase2
 * <p>
 * Habilitação, Julgamento, Adjudicação e Homologação do processo licitatório
 * 
 */
@Entity(name = "LICITACAOFASE2")
@Data
public class LicitacaoFaseDois extends BaseEntityID {

    /**
     * ID do processo de abertura da licitação (Fase 1)
     * (Required)
     * 
     */
    @NotNull
    private Integer idLicitacaoFase1;
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
    
    
    @Valid
    @OneToMany
    @JoinColumn(name = "LICITACAOFASE2_ID")
    private Set<Licitante> licitantes = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "LICITACAOFASE2_ID")
    private Set<Resultado> resultado = new HashSet<>();

    @Valid
    @OneToMany
    @JoinColumn(name = "LICITACAOFASE2_ID")
    private Set<ResponsaveisFaseDois> responsaveis = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "LICITACAOFASE2_ID")
    private Set<ParecerFaseDois> parecerFaseDois = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "LICITACAOFASE2_ID")
    private Set<AtasLicitacao> atasLicitacao = new HashSet<>();


}
