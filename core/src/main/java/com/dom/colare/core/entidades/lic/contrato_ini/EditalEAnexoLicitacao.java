package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.EditalEAnexo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "CONT_LIC_EDITAL")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class EditalEAnexoLicitacao extends EditalEAnexo {
}
