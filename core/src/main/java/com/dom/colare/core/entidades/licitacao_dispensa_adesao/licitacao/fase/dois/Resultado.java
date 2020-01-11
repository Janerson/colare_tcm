
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

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
 * resultado
 * <p>
 * Dados do resultado (vencedor) da licitação (após negociação)
 * 
 */
@Entity
@Data
public class Resultado extends BaseEntityID {

    /**
     * Data da Adjudicação da Licitação
     * 
     */
    private String dataAdjudicacao;
    /**
     * Data da homologação
     * 
     */
    private String dataHomologacao;
    /**
     * Identifica o tipo do documento
     * 
     */
    private Integer codTipoDocumento;
    /**
     * Número do documento
     * 
     */
    private String numeroDocumento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "resultado_id")
    private Set<PrecoFinal> precoFinal = new HashSet<>();

}
