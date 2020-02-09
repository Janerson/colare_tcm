package com.dom.colare.domain.api;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Menu")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String url;
    private String icon;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BADGE_ID")
    private Badge badge;

    private Boolean title;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")
    private List<Menu> children = new ArrayList<>();

    private String variant;
    private Boolean divider;
    private String classe;

    public void setUrl(String url) {
        this.url = url.startsWith("/") ? url : "/" + url;
    }
}
