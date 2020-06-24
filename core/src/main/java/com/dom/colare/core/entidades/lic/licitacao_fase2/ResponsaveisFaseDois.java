
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.Responsavel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * responsaveisPelaLicitacao
 * <p>
 * Responsáveis pela licitação
 * 
 */
@Entity(name = "RESP_FASE2")
@Data
@PrimaryKeyJoinColumn(name = "codigo")
public class ResponsaveisFaseDois extends Responsavel {


}
