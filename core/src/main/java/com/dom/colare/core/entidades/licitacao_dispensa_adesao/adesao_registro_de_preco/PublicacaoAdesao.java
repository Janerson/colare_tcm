
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * publicacao
 * <p>
 * Publicação do termo de adesão a registro de preços
 * 
 */
@Entity
@Data
public class PublicacaoAdesao extends Publicacao {

    @ManyToOne
    private AdesaoARegistroDePrecos adesaoARegistroDePrecos;
}
