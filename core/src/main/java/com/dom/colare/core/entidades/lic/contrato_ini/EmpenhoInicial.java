package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.Empenho;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * empenho
 * <p>
 * Dados do empenho decorrente do contrato
 */
@Entity(name = "EMP_CONTRAT_INI")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class EmpenhoInicial extends Empenho {

}
