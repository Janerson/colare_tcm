
package com.dom.colare.core.entidades.atos_de_pessoal.pes_pensionist;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


/**
 * requisitosFinanceiros
 * <p>
 * Contém os dados dos proventos do pensionista.
 * 
 */
@Entity(name = "PES_PENS_FIN")
@Data
public class RequisitosFinanceiros extends BaseEntityID {

    /**
     * Informa qual foi a fixação dos proventos de pensão, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer tipoFixacaoProventosPensao;
    /**
     * Informa o valor total dos proventos, que o pensionista receberá.
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    private Double valorTotalProventos;
    /**
     * Informar o valor do redutor, para provento superiores ao teto RGPS
     * 
     */
    @DecimalMin("0")
    private Double valorRedutorProvento;
    /**
     * Informa o percentual da utilizado para aplicação redutor.
     * 
     */
    @DecimalMin("0")
    private Double percentualRedutor;

    @Valid
    @OneToMany
    @JoinColumn(name = "PES_PENS_FIN_ID")
    private Set<ComposicaoUltimaRemuneracao> composicaoUltimaRemuneracao = new HashSet<>();


}
