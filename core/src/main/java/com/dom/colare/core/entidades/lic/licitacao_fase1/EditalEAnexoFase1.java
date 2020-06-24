package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.EditalEAnexo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "FAS1_EDIT_ANEX")
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class EditalEAnexoFase1 extends EditalEAnexo {
}