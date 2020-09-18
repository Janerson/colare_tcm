package com.dom.colare.domain.dto.passaporte;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

@Data
public class UnidadeGestoraDTO extends BaseDTO {
    private String tipo;
    private long idUnidadeGestoraPai;
    private String nomePessoaJuridica;
    private String nome;
    private String cnpj;
    private String dataLeiCriacao;
    private String aprovacaoStatus;
    private String dataLeiExtincao;
    private long id;
    private String tipoCadastro;
    private String dataCadastro;
    private String razaoSocial;
    private String status;
}
