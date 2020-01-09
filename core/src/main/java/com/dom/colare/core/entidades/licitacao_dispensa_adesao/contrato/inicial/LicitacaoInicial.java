
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

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
@Entity
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
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "licitacaoInicial")
    public Set<EditalEAnexo> editalEAnexos = new HashSet<>();

    @OneToOne
    @MapsId
    private ProcedimentoDeContratacao procedimentoDeContratacao;
}
