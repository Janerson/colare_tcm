
package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.Licitacao;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * licitacao
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "1-Licitação", com os dados da licitação da qual resultou o contrato.
 * 
 */
@Entity(name = "CONTR_PROC_LIC")
@Data
public class LicitacaoInicial extends Licitacao {

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTR_PROC_LIC_ID")
    private Set<EditalEAnexoLicitacao> editalEAnexos = new HashSet<>();

}
