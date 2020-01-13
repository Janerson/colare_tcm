
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_legislacao;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * pessoalLegislacao
 * <p>
 * Legislação e Normas de Pessoal
 * 
 */
@Entity(name ="PES_LEGISLACAO")
@Data
public class PessoalLegislacao extends BaseEntityID {

    /**
     * Tipo do Ente Federado
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnte;
    /**
     * Tipo da Norma
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoNorma;
    /**
     * Detalhamento da Norma
     * (Required)
     * 
     */
    @NotNull
    private Integer codDetalhamentoNorma;
    /**
     * Número da norma (sem o ano)
     * (Required)
     * 
     */
    @NotNull
    private String numeroDaNorma;
    /**
     * Ano da Norma com 4 dígitos (AAAA)
     * (Required)
     * 
     */
    @DecimalMin("1900")
    @DecimalMax("2050")
    @NotNull
    private Integer anoDaNorma;
    /**
     * Data da Publicação
     * (Required)
     * 
     */
    @NotNull
    private String dataPublicacao;
    /**
     * Data do início da vigência
     * (Required)
     * 
     */
    @NotNull
    private String inicioVigencia;
    /**
     * Data de inicio do efeito financeiro
     * 
     */
    private String dataInicioEfeitoFinanceiro;
    /**
     * Data do fim da vigência
     * 
     */
    private String fimVigencia;
    /**
     * Ementa da Norma
     * (Required)
     * 
     */
    @NotNull
    private String ementaDaNorma;
    /**
     * Código do Tipo de Envio
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoEnvio;
    /**
     * Motivo da retificação de dados.
     * 
     */
    private String motivoRetificacao;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_LEGISLACAO_ID")
    private Set<AssuntosDaNorma> assuntosDaNorma = new HashSet<>();
    /**
     * aNormaRegulamentaOutroIdpessoallegislacao
     * <p>
     * Informar se a presente Norma, regulamenta outra Norma/Legislação
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_REG_OUTROID_ID")
    private ANormaRegulamentaOutroIdpessoallegislacao aNormaRegulamentaOutroIdpessoallegislacao;
    /**
     * unidadesGestorasAplicaveis
     * <p>
     * Informa todas as Unidades Gestoras, as quais a presente Norma/Legislação é Aplicável. 
     * (Required)
     * 
     */
    @Valid
    @NotNull
    @OneToOne
    @JoinColumn(name = "PES_UG_APLICNOR_ID", insertable = false, updatable = false)
    private UnidadesGestorasAplicaveis unidadesGestorasAplicaveis;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "PES_LEGISLACAO_ID")
    private Set<TextoDaNormaOuLegislacao> textoDaNormaOuLegislacao = new HashSet<>();


}
