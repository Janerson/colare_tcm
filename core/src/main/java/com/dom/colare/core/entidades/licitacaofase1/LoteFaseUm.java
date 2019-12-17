package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.shared.Lote;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class LoteFaseUm extends Lote {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licitacao_fase_um_id")
    public LicitacaoFaseUm licitacaoFaseUm;
}
