
package com.dom.colare.core.entidades.atos_de_pessoal.pes_con_psp;

import com.dom.colare.core.entidades.shared.TextoEdital;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * textoDoEdital
 * <p>
 * Contem os documentos relativos ao corpo do Edital e seus Anexos
 * 
 */
@Entity(name = "PES_CON_TXT")
@Data
@PrimaryKeyJoinColumn(name = "codigo")
public class TextoDoEditalProcessoSeletivo extends TextoEdital {


}
