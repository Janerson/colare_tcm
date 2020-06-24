package com.dom.colare.core.entidades.lic.contrato_adt;

import com.dom.colare.core.entidades.shared.Licitacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "ADTV_CONT_LICIT")
@Data
@PrimaryKeyJoinColumn(name = "uuid")
public class LicitacaoAditivo extends Licitacao {
}
