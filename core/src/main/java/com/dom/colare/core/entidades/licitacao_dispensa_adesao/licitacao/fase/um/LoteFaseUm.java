
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Lote;
import lombok.Data;

import javax.persistence.Entity;
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
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class LoteFaseUm extends Lote {

    @Size(min = 1)
    @Valid
    @NotNull
    public Set<ItemFaseUm> item = new HashSet<>();

}
