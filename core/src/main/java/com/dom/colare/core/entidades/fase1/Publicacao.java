
package com.dom.colare.core.entidades.fase1;

import com.dom.colare.core.entidades.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;

/**
 * publicacao
 * <p>
 * Informação de todas as publicações do Edital ou Convite
 * 
 */
@Entity
@Data
public class Publicacao  extends BaseEntityID {

    /**
     * Data da Publicação
     * (Required)
     * 
     */
    public String dataPublicacao;
    /**
     * Código do veículo da Publicação
     * (Required)
     * 
     */
    public Integer codVeiculoPublicacao;
    /**
     * Descrição
     * 
     */
    public String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    public String idDocumentoPDF;



}
