package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "RESP_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "codigo")
public class ResposanvelFaseUm extends Responsavel {

}
