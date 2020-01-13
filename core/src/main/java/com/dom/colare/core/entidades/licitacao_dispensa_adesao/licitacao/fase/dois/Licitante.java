
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


/**
 * licitantes
 * <p>
 * Participantes habilitáveis
 * 
 */
@Entity(name = "LIC_FASE2")
@Data
public class Licitante extends BaseEntityID {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    private String numeroDocumento;
    /**
     * Número de Inscrição Estadual
     * 
     */
    private String numeroInscricaoEstadual;
    /**
     * Código IBGE do Estado onde foi realizada a inscrição
     * 
     */
    private String codIbgeInscricaoEstadual;
    /**
     * Número de inscrição municipal
     * 
     */
    private String numeroInscricaoMunicipal;
    /**
     * Informa se se trata de uma S/A de Capital Aberto e com registro na CVM
     * (Required)
     * 
     */
    @NotNull
    private Boolean empresaDeCapitalAbertoCVM;

    @Valid
    @OneToMany
    @JoinColumn(name = "LIC_FASE2_ID")
    private Set<QuadroSocietarioFaseDois> quadroSocietarioFaseDois = new HashSet<>();


    @Valid
    @OneToMany
    @JoinColumn(name = "LIC_FASE2_ID")
    private Set<MapaDePreco> mapaDePrecos = new HashSet<>();
    /**
     * habilitacao
     * <p>
     * Habilitação do licitante
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "HABILIT_FASE2_ID")
    private Habilitacao habilitacao;
    /**
     * julgamento
     * <p>
     * Julgamento das propostas, por licitante
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "JULG_FASE2_ID")
    private Julgamento julgamento;

   
}
