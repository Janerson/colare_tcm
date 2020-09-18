package com.dom.colare.core.entidades.passaporte;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity(name = "UNIDADES_GESTORAS")
public class UnidadeGestora extends BaseEntityID {
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

