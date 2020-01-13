package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "RESP_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class ResposanvelFaseUm extends Responsavel {

}
