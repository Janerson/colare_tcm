
package com.dom.colare.core.entidades.lic.contrato_ini;

import com.dom.colare.core.entidades.shared.Documento;
import lombok.Data;

import javax.persistence.Entity;


/**
 * documentos
 * <p>
 * Documentos relacionados à adesão
 * 
 */
@Entity(name = "CONTR_PROC_DOCS")
@Data
public class DocumentoCtInicial extends Documento {
}
