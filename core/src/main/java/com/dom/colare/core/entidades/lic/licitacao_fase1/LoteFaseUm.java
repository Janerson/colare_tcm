
package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Lote;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;
/**
 * lote
 * <p>
 * – Cadastro de Lotes do Processo Licitatório
 */
@Getter
@Setter
@Entity(name = "LOTE_FASE1")
@PrimaryKeyJoinColumn(name = "id")
public class LoteFaseUm extends Lote {

    public LoteFaseUm() {
    }

    //@Size(min = 1)
    @Valid
    @OneToMany(mappedBy = "lote",cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<ItemFaseUm> item = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LICITACAOFASE1_ID")
   // @JsonBackReference
    private LicitacaoFaseUm faseUm;

}
