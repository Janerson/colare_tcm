package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.NaturezaObjetoDetalhada;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "FAS1_NATOBJDET")
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class NaturezaObjetoDetalhadaFase1 extends NaturezaObjetoDetalhada {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private LicitacaoFaseUm faseUm;
}
