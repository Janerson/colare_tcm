package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * comissao
 * <p>
 * Detalhamento da composição da comissão de licitação / Pregoeiro - Equipe de Apoio
 */
@Entity(name = "COMISSAO_FASE1")
@Data
public class Comissao extends BaseEntityID {
    /**
     * Código que identifica o tipo da comissão
     * (Required)
     */
    @NotNull
    private Integer codTipoComissao;
    /**
     * Tipo do ato de nomeação da comissão
     * (Required)
     */
    @NotNull
    private Integer codTipoAtoNomeacao;
    /**
     * Número do Ato de Nomeação
     * (Required)
     */
    @NotNull
    private String numeroAtoNomeacao;
    /**
     * Data do Ato de Nomeação
     * (Required)
     */
    @NotNull
    private String dataAtoNomeacao;
    /**
     * Data do início da vigência
     * (Required)
     */
    @NotNull
    private String inicioVigencia;
    /**
     * Data do fim da vigência
     * (Required)
     */
    @NotNull
    private String fimVigencia;
    /**
     * (Required)
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "COMISSAO_FASE1_ID")
    private Set<Membro> membro = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private LicitacaoFaseUm faseUm;


}
