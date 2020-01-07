
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.Dotacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * dotacao
 * <p>
 * Dotação orçamentária
 * 
 */
@Entity
@Data
public class DotacaoAdesao extends Dotacao {

    @ManyToOne
    private RecursoOrcamentarioAdesao recursoOrcamentarioAdesao;

}
