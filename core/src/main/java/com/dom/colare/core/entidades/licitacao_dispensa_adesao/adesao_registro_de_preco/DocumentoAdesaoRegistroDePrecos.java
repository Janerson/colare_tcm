
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

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
