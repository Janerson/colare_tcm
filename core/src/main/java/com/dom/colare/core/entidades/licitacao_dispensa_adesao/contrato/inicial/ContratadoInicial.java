
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.contrato.inicial;

import com.dom.colare.core.entidades.shared.Contratado;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * contratado
 * <p>
 * Dados do contratado
 * 
 */
@Entity
@Data
public class ContratadoInicial extends Contratado {

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    private String numeroDocumento;
    /**
     * Número de Inscrição Estadual
     * 
     */
    private String numeroInscricaoEstadual;
    /**
     * Código IBGE do Estado onde foi realizada a inscrição
     * 
     */
    private String codIbgeInscricaoEstadual;

    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    private String idDocumentoPDF;
    /**
     * Número de inscrição no CREA/CAU
     * 
     */
    private String numeroInscricaoCREA_CAU;
    /**
     * Código IBGE da unidade onde foi realizada a inscrição
     * 
     */
    private String codIbgeUFInscricaoCREA_CAU;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contratadoInicial")
    private Set<PrecoContratadoInicial> precoContratado = new HashSet<>();

    @Valid
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contratoInicial")
    private Set<QuadroSocietarioContratoInicial> quadroSocietario = new HashSet<>();

    @OneToOne
    @MapsId
    private ContratoInicial contratoInicial;

}
