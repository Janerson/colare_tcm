package com.dom.colare.core.entidades.passaporte;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Entity(name = "REPRESENTACOES")
public class Representacao extends BaseEntityID {
    private long codigo;
    private String representacao;
    private long unidadeID;
    private String unidade;
    private String tipo;
    private String poder;
    private long municipioID;
    private String municipio;
    private LocalDate dataInicioRepresentacao;
    private LocalDate dataFimRepresentacao;
}
