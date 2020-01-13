package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

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
