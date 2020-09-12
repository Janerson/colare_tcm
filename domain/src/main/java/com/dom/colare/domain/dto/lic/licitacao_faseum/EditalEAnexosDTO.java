package com.dom.colare.domain.dto.lic.licitacao_faseum;

/**
 * Informar os anexos e/ou o edital em partes separadas (ex. parte 2 de 3)
 */
@lombok.Data
public class EditalEAnexosDTO {
    private long codTipoEditalAnexos;
    private String descricao;
    private String idDocumentoPDF;
}
