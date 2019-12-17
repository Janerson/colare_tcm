package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.shared.Parecer;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class ParecerFaseUm extends Parecer {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licitacao_fase_um_id")
    public LicitacaoFaseUm licitacaoFaseUm;
}
