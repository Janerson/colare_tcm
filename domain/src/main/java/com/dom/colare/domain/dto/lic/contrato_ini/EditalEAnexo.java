
package com.dom.colare.domain.dto.lic.contrato_ini;

import lombok.Data;

/**
 * editalEAnexos
 * <p>
 * Edital do Credenciamento / Chamada Pública - Preenchimento exclusivo e obrigatório se tipoProcesso = 1 ou 3 (Credenciamento ou chamada pública). Arquivos PDF do Edital e seus Anexos.
 * 
 */
@Data
public class EditalEAnexo {

    /**
     * Código do tipo de documento enviado - Edital e Anexos, conforme tabela
     * (Required)
     * 
     */
    private int codTipoEditalAnexos;
    /**
     * Descrição
     * (Required)
     * 
     */
    private String descricao;
    /**
     * ID do arquivo enviado contendo o documento digitalizado
     * (Required)
     * 
     */
    private String idDocumentoPDF;

  

}
