package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


/**
 * dispensaEInexigibilidade
 * <p>
 * Preencher exclusivamente e obrigatoriamente quando codTipoProcedimento for igual a "2-Dispensa", com os dados da dispensa/inexigibilidade da qual resultou o contrato.
 */
@Entity
@Data
public class DispensaEInexigibilidadeAte2018 extends BaseEntityID {

    /**
     * Tipo do processo de Dispensa
     * (Required)
     */
    @NotNull
    public Integer codTipoProcesso;
    /**
     * Exercício do Processo de Dispensa
     * (Required)
     */
    @DecimalMin("1990")
    @DecimalMax("2018")
    @NotNull
    public Integer exercicioProcesso;

    @Valid
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dispensaEInexigibilidade")
    public Set<EditalEAnexo> editalEAnexos = new HashSet<>();


}
