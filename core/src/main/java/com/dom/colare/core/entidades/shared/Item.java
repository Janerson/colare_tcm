
package com.dom.colare.core.entidades.shared;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;


/**
 * item
 * <p>
 * Cadastro de Itens do Processo Licitatório
 * 
 */
@Entity(name = "ITEM")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Item extends BaseEntityID {
    /**
     * Número do Item
     * (Required)
     * 
     */
    @Column
    public Integer numeroItem;
    /**
     * Quantidade
     * (Required)
     * 
     */
    @Column
    public Double quantidade;
    /**
     * Descrição
     * (Required)
     * 
     */
    @Column
    public String descricao;
    /**
     * Código de Mercadoria ou Serviço dos itens
     * 
     */
    @Column
    public Integer codigoUnicoMercadoriaOuServico;
    /**
     * Código da unidade medida
     * (Required)
     * 
     */
    @Column
    public int codUnidadeMedida;
    /**
     * Valor de referência
     * (Required)
     * 
     */
    @Column
    public Double valorDeReferencia;
    /**
     * Indica se é o preço máximo
     * (Required)
     * 
     */
    @Type(type = "true_false")
    @Column
    public Boolean precoMaximo;
    /**
     * Código da origem do valor de referência
     * (Required)
     * 
     */
    @Column
    public int codOrigemValorReferencia;
    /**
     * Quantidade desdobrada (quantas unidades contém a caixa / fardo / pacote)
     * 
     */
    @Column
    public Double quantidadeDesdobraUnidade;
    /**
     * Descreve onde foi obtido o valor de referência.
     * 
     */
    @Column
    public String descricaoOrigemValorReferencia;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lote_id")
    public Lote lote;


}
