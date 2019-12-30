
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 * recursoOrcamentario
 * <p>
 * Detalhamento dos Recursos Orçamentários
 * 
 */
@Entity
@Data
public class RecursoOrcamentarioFaseUm extends BaseEntityID {

    @ManyToOne
    private LicitacaoFaseUm licitacaoFaseUm;

}
