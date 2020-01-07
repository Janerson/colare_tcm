
package com.dom.colare.core.entidades.licitacao_dispensa_adesao.adesao_registro_de_preco;

import com.dom.colare.core.entidades.shared.Item;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


/**
 * item
 * <p>
 * Itens aderidos
 * 
 */
@Entity
@Data
public class ItemAdesaoRegistroPreco extends Item {

    /**
     * Descrição
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String descricao;


    /**
     * Quantidade licitada
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double quantidadeLicitada;


    /**
     * Valor Unitário
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double valorUnitario;
    /**
     * Quantidade aderida
     * (Required)
     * 
     */
    @DecimalMin("0")
    @NotNull
    @Column
    private Double quantidadeAderida;

    /**
     * Identifica o tipo do documento
     * (Required)
     * 
     */
    @NotNull
    @Column
    private int codTipoDocumento;
    /**
     * Número do documento
     * (Required)
     * 
     */
    @NotNull
    @Column
    private String numeroDocumento;
    /**
     * 
     * (Required)
     * 
     */
    @Size(min = 1)
    @Valid
    @NotNull
    @OneToMany
    private Set<CotacaoPropria> cotacaoPropria = new HashSet<>();

    @ManyToOne
    private LoteAdesaoRegistroPreco loteAdesaoRegistroPreco;



}
