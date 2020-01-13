
package com.dom.colare.core.entidades.atos_de_pessoal.pessoal_pensionista;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


/**
 * documentosComprobatoriosDependencia
 * <p>
 * Contém os documento que comprovam vinculo do Dependente em relação ao Instituidor.
 * 
 */
@Entity(name = "PES_PENS_DOCCOM")
@Data
public class DocumentosComprobatoriosDependencia extends BaseEntityID {

    /**
     * Informa o tipo de documento que comprova a relação de dependência entre o pensionista e o instituidor, conforme tabela.
     * (Required)
     * 
     */
    @NotNull
    public Integer tipoDocumentoComprobatorio;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    @NotNull
    public String idDocumentoPDF;



}
