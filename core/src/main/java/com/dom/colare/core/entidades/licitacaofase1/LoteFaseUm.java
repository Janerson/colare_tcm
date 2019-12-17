package com.dom.colare.core.entidades.licitacaofase1;

import com.dom.colare.core.entidades.shared.Lote;
import lombok.Data;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
@Data
public class LoteFaseUm extends Lote {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "licitacao_fase_um_id")
    public LicitacaoFaseUm licitacaoFaseUm;
}
