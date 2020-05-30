
package com.dom.colare.core.entidades.atos_de_pessoal.pes_procselsimp;

import com.dom.colare.core.entidades.shared.TextoEdital;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * textoEdital
 * <p>
 * Informa o texto do edital e anexo
 * 
 */
@Entity(name = "PES_PSS_TXTEDIT")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class TextoEditalSimplificado extends TextoEdital {

}
