package com.dom.colare.core.entidades.api;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;
    private String variant;
    private String classe;

    public void setText(String text) {
        this.text = text.toUpperCase();
    }
}
