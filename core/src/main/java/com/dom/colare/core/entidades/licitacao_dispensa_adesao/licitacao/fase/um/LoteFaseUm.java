
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Lote;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 */
@Entity(name = "LOTE_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class LoteFaseUm extends Lote {

    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "LOTE_FASE1_ID")
    public Set<ItemFaseUm> item = new HashSet<>();

}
