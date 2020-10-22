package com.dom.colare.core.entidades.lic.licitacao_fase1;

import com.dom.colare.core.entidades.shared.Parecer;
import lombok.Data;

import javax.persistence.*;


/**
 * parecer
 * <p>
 * Parecer da Licitação
 */
@Entity(name = "PAREC_FASE1")
@Data
@PrimaryKeyJoinColumn(name = "id")
public class ParecerFaseUm extends Parecer {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LICITACAOFASE1_ID")
    private LicitacaoFaseUm faseUm;

}
