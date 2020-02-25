package com.dom.colare.core.entidades.api;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Menu")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    private boolean title;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "MENU_ID")
    private Set<MenuLink> links = new HashSet<>();

    public boolean isTitle() {
        return true;
    }

    public void setTitle(boolean title) {
        this.title = !title;
    }
}
