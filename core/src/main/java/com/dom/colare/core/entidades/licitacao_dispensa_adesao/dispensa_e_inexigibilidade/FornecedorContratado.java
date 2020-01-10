
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.dispensa_e_inexigibilidade;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * fornecedorContratado
 * <p>
 * Fornecedor contratado por meio de Dispensa. Preenchimento exclusivo e obrigatório quando NÃO se tratar de credenciamento ou chamada pública.
 * 
 */
@Entity
@Data
public class FornecedorContratado extends BaseEntityID {

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
     * Número da Certidão de Regularidade do INSS
     * 
     */
    private String numeroCertidaoRegularidadeINSS;
    /**
     * Número da Certidão de Regularidade do FGTS
     * 
     */
    private String numeroCertidaoRegularidadeFGTS;
    /**
     * Número da Certidão negativa de Débitos Trabalhistas
     * 
     */
    private String numeroCNDT;
    /**
     * Código IBGE do Estado onde foi realizada a inscrição
     * 
     */
    private String codIbgeInscricaoEstadual;
    /**
     * Informa se se trata de uma S/A de Capital Aberto e com registro na CVM
     * (Required)
     * 
     */
    @NotNull
    private Boolean empresaDeCapitalAbertoCVM;


    @Valid
    @OneToMany
    @JoinColumn(name = "fornecedor_id")
    private Set<QuadroSocietarioDispensa> quadroSocietarioDispensa = new HashSet<>();
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "fornecedor_id")
    private Set<PrecoContratadoDispensa> precoContratado = new HashSet<>();

   

}
