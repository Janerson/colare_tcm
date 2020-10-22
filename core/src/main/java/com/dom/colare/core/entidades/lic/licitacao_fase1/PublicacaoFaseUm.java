
package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Publicacao;
import lombok.Data;

import javax.persistence.*;


/**
 * publicacao
 * <p>
 * Informação de todas as publicações do Edital ou Convite
 * 
 */
@Entity(name = "PUB_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class PublicacaoFaseUm extends Publicacao {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private LicitacaoFaseUm faseUm;

}
