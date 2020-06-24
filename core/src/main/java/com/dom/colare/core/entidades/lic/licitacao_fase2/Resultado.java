
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Column;
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
@Entity(name = "RESULTADO_FASE2")
@Data
public class Resultado extends BaseEntityID {

    /**
     * Data da Adjudicação da Licitação
     * 
     */
    @Column
    private String dataAdjudicacao;
    /**
     * Data da homologação
     * 
     */
    @Column
    private String dataHomologacao;
    /**
     * Identifica o tipo do documento
     * 
     */
    @Column
    private Integer codTipoDocumento;
    /**
     * Número do documento
     * 
     */
    @Column
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
    @JoinColumn(name = "RESULTADO_FASE2_ID")
    private Set<PrecoFinal> precoFinal = new HashSet<>();

}
