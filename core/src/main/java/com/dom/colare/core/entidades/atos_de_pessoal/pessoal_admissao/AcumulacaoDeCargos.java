
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_admissao;

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
 * acumulacaoDeCargos
 * <p>
 * Informar Acumulação de Cargo
 * 
 */
@Entity
@Data
public class AcumulacaoDeCargos extends BaseEntityID {

    /**
     * Informa se o servidor acumula cargo quando do momento da posse no serviço público.
     * (Required)
     * 
     */
    @NotNull
    private Boolean acumulaCargo;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "acumulacao_cargos_id")
    private Set<DadosDaAcumulacao> dadosDaAcumulacao = new HashSet<>();


}
