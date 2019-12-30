package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Parecer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 * parecer
 * <p>
 * Parecer da Licitação
 */
@Entity
@Data
public class ParecerFaseUm extends Parecer {

    @ManyToOne
    private LicitacaoFaseUm licitacaoFaseUm;

}
