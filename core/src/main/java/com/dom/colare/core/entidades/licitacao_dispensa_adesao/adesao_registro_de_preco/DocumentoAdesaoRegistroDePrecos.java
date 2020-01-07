
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * documentos
 * <p>
 * Dados dos documentos relacionados à adesão
 * 
 */
@Entity
@Data
public class DocumentoAdesaoRegistroDePrecos extends BaseEntityID {

    @ManyToOne
    private AdesaoARegistroDePrecos adesaoARegistroDePrecos;
}
