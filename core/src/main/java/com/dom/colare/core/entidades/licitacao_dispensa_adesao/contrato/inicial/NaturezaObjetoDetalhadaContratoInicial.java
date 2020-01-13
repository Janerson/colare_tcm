package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.NaturezaObjetoDetalhada;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "CONTR_NATOBJDET")
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class NaturezaObjetoDetalhadaContratoInicial extends NaturezaObjetoDetalhada {
}
