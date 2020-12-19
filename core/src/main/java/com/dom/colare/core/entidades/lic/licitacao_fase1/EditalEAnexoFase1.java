package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.EditalEAnexo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "FAS1_EDIT_ANEX")
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "ID")
public class EditalEAnexoFase1 extends EditalEAnexo {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    @JsonBackReference
    private LicitacaoFaseUm faseUm;
}
