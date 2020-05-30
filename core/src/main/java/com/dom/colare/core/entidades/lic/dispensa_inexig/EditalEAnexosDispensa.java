package com.dom.colare.core.entidades.lic.dispensa_inexig;

import com.dom.colare.core.entidades.shared.EditalEAnexo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "DISP_EDIT_ANEX")
@Data
@PrimaryKeyJoinColumn(name = "ID")
public class EditalEAnexosDispensa extends EditalEAnexo {
}
