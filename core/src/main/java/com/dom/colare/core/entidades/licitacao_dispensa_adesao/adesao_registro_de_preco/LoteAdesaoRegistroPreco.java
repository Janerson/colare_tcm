
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.Lote;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * lote
 * <p>
 * Dados do lote do registro de preços
 * 
 */
@Entity
@Data
public class LoteAdesaoRegistroPreco extends Lote {

    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "loteAdesaoRegistroPreco")
    private Set<ItemAdesaoRegistroPreco> item = null;

    @ManyToOne
    private OrgaoGerenciadorDaAdesao orgaoGerenciadorDaAdesao;
}
