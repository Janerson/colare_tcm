
package com.dom.colare.core.entidades.lic.licitacao_fase2;

import com.dom.colare.core.entidades.shared.QuadroSocietario;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * quadroSocietario
 * <p>
 * Composição do Quadro Societário 
 * 
 */
@Entity(name = "QUADSOC_FASE2")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class QuadroSocietarioFaseDois extends QuadroSocietario {



}
