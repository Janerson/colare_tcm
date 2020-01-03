
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.licitacao.fase.um;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 * publicacao
 * <p>
 * Informação de todas as publicações do Edital ou Convite
 * 
 */
@Entity
@Data
public class PublicacaoFaseUm extends Publicacao {

    @ManyToOne
    private LicitacaoFaseUm licitacaoFaseUm;
}
