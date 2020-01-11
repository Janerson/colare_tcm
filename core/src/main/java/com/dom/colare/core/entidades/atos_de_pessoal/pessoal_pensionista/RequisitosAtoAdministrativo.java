
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * requisitosAtoAdministrativo
 * <p>
 * Contém os dados do requerimento inicial.
 * 
 */
@Entity
@Data
public class RequisitosAtoAdministrativo extends BaseEntityID {

    /**
     * Informa o tipo do Ato Administrativo
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoAtoAdministrativo;
    /**
     * Informa o numero do Ato Administrativo
     * (Required)
     * 
     */
    @DecimalMin("1")
    @NotNull
    private Integer numeroAtoAdministrativo;
    /**
     * Informa a data do Ato Administrativo
     * (Required)
     * 
     */
    @NotNull
    private String dataAtoAdministrativo;
    /**
     * Data de inicio do efeito financeiro
     * (Required)
     * 
     */
    @NotNull
    private String dataInicioEfeitoFinanceiro;
    /**
     * Data da Publicação
     * (Required)
     * 
     */
    @NotNull
    private String dataPublicacao;
    /**
     * Informar a Certidão ou Comprovante de Publicação 
     * (Required)
     * 
     */
    @NotNull
    private String certidaoDePublicacaoOuComprovante;
    /**
     * Informa qual a forma de reajuste dos Proventos de Inativo Pensionista.
     * (Required)
     * 
     */
    @NotNull
    private Integer codFormaDeReajuste;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    private String idDocumentoPDF;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    @JoinColumn(name = "requitos_adm_id")
    private Set<Numerocpfdoresponsavelpeloato> numerocpfdoresponsavelpeloato = new HashSet<>();


}
