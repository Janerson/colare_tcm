
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.Publicacao;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * publicacao
 * <p>
 * Publicação do contrato.
 * 
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class PublicacaoInicial extends Publicacao {

    @ManyToOne
    private ContratoInicial contratoInicial;
}
