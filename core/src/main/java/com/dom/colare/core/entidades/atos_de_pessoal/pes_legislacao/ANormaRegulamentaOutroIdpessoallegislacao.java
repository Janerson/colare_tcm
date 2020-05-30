package com.dom.colare.core.entidades.atos_de_pessoal.pes_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Set;


/**
 * aNormaRegulamentaOutroIdpessoallegislacao
 * <p>
 * Informar se a presente Norma, regulamenta outra Norma/Legislação
 */
@Entity(name = "PES_REG_OUTROID")
@Data
public class ANormaRegulamentaOutroIdpessoallegislacao extends BaseEntityID {

    /**
     * Informa se a presente norma regulamenta ou não outra Legislação de Pessoal
     * (Required)
     */
    @NotNull
    private Boolean normaRegulamentaOutroIDPessoalLegislacao;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_REG_OUTROID_ID")
    private Set<NormaOuLegislacaoRegulamentada> normaOuLegislacaoRegulamentada = null;


}
