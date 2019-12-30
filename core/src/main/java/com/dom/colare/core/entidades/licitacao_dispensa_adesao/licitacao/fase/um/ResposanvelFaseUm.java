package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ResposanvelFaseUm extends Responsavel {

    @ManyToOne
    private LicitacaoFaseUm licitacaoFaseUm;
}
