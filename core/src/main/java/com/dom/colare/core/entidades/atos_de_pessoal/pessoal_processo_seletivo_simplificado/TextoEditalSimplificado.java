
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_processo_seletivo_simplificado;

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
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class TextoEditalSimplificado extends TextoEdital {

}
