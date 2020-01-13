package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.Licitacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "ADTV_CONT_LICIT")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class LicitacaoAditivo extends Licitacao {
}
