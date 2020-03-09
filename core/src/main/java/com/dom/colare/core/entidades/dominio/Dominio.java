package com.dom.colare.core.entidades.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="dominio")
public class Dominio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long codigo;
    private String descricao;
    private String vigencia;
    private boolean ativo;

    //01/2017 à 12/2099
    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
        String[] vArray = vigencia.split("à");
        if (vArray.length == 1) {
            ativo = true;
        } else {
            String[] ref = vArray[1].split("/");
            ativo = Integer.parseInt(ref[1]) >= LocalDate.now().getYear();
        }
    }
}
