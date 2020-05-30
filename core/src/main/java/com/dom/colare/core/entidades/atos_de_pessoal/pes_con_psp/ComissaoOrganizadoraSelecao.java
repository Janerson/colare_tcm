
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

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
 * comissaoOrganizadoraSelecao
 * <p>
 * Comissão Organizadora da Seleção
 * 
 */
@Entity(name = "PES_CON_COMISSA")
@Data
public class ComissaoOrganizadoraSelecao extends BaseEntityID {

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_CON_COMISSA_ID")
    public Set<DetalhamentoMembrosComissao> detalhamentoMembrosComissao = new HashSet<>();

}
