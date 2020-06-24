package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.NaturezaObjetoDetalhada;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "CONTR_NATOBJDET")
@Data
@PrimaryKeyJoinColumn(name = "uuid")
public class NaturezaObjetoDetalhadaContratoInicial extends NaturezaObjetoDetalhada {
}
