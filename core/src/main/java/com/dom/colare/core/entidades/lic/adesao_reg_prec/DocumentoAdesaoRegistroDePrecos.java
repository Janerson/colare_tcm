
package com.dom.colare.core.entidades.lic.adesao_reg_prec;

import com.dom.colare.core.entidades.shared.Documento;
import lombok.Data;

import javax.persistence.Entity;

/**
 * documentos
 * <p>
 * Dados dos documentos relacionados à adesão
 * 
 */
@Entity(name = "DOC_ADESAO")
@Data
public class DocumentoAdesaoRegistroDePrecos extends Documento {
}
