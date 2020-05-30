package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.NaturezaObjetoDetalhada;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "FAS1_NATOBJDET")
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class NaturezaObjetoDetalhadaFase1 extends NaturezaObjetoDetalhada {
}
