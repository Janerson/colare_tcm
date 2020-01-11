
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_concessao_vantagem_desconto;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


/**
 * verba
 * <p>
 * Contém as Informações referente a Verba (Remuneração Desconto) aplicada ao Servidor Ativo, Inativo ou o Pensionista.
 * 
 */
@Entity
@Data
public class Verba extends BaseEntityID {

    /**
     * Informa o ID da Verba, cadastrada no Layout Pessoal Verbas.
     * (Required)
     * 
     */
    @NotNull
    private Integer idPessoalVerbas;
    /**
     * Data de Inicio
     * (Required)
     * 
     */
    @NotNull
    private String dataInicio;
    /**
     * Data fim
     * 
     */
    private String dataFinal;
    /**
     * Informa a quantidade de parcelas.
     * 
     */
    private Integer numeroDeParcelas;
    /**
     * Tipo de Verba
     * (Required)
     * 
     */
    @NotNull
    private Integer codTipoVerba;
    /**
     * Informa valor da Verba (Remuneração ou Desconto)
     * 
     */
    @DecimalMin("0")
    private Double valor;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * 
     */
    private String idDocumentoPDF;
    /**
     * informa a modalidade da remuneração, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codModalidadeRemuneracao;
    /**
     * Informa a modalidade do desconto, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    private Integer codModalidadeDesconto;

}
