
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.DetalhamentoPublicidadeExtratoEdital;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * detalhamentoPublicidadeExtratoEdital
 * <p>
 * Detalhamento da Publicidade do  Extrato do Edital
 * 
 */
@Entity(name = "PES_CON_EXTRATP")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class DetalhamentoPublicidadeExtratoEditalSeletivoPublico extends DetalhamentoPublicidadeExtratoEdital {


}
