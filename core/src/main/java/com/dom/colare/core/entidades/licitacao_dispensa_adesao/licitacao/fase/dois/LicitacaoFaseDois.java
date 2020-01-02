
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import com.dom.colare.core.entidades.dominio.TipoEnvio;
import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
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
@Entity
@Data
public class LicitacaoFaseDois extends BaseEntityID {

    /**
     * ID do processo de abertura da licitação (Fase 1)
     * (Required)
     * 
     */
    @NotNull
    public Integer idLicitacaoFase1;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    public TipoEnvio codTipoEnvio;
    /**
     * Descreve o motivo da Atualização ou Correção
     * 
     */
    public String motivoAtualizacaoCorrecao;
    @Valid
    public Set<Licitante> licitantes = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<Resultado> resultado = null;


    @Valid
    public Set<ResponsaveisPelaLicitacao> responsaveisPelaLicitacao = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ParecerFaseDois> parecerFaseDois = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    public Set<AtasLicitacao> atasLicitacao = new HashSet<>();


}
