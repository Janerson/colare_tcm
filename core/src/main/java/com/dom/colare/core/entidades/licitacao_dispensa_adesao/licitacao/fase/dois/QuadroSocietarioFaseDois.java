
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.dois;

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
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class QuadroSocietarioFaseDois extends QuadroSocietario {



}
