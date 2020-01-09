
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.aditivo;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 * publicacao
 * <p>
 * Publicação do contrato aditivo
 * 
 */
@Entity
@Data
public class PublicacaoAditivo extends Publicacao {

    @ManyToOne
    private ContratoAditivo contratoAditivo;

}
