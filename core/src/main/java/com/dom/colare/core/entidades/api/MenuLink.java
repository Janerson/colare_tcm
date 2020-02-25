package com.dom.colare.core.entidades.api;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "MENU_LINK")
@Data
public class MenuLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String url;
    private String icon;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BADGE_ID")
    private Badge badge;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "MENU_LINK_ID")
    private List<MenuLink> children = new ArrayList<>();

    private String variant;
    private Boolean divider;
    private String classe;

    public void setUrl(String url) {
        this.url = url.startsWith("/") ? url : "/" + url;
    }
}
