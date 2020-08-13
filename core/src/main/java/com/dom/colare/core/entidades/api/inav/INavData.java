package com.dom.colare.core.entidades.api.inav;

import com.dom.colare.core.entidades.shared.BaseEntityID;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "INAV_DATA")
@Data
public class INavData extends BaseEntityID {
    private String name;
    private String url;
    private String layoutTitulo;
    private String layoutDescricao;
    private String href;
    private String icon;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "BADGE_ID")
    private INavBadge badge;
    private Boolean title;

    @OrderBy(value = "seq")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "MENU_ID")
    private List<INavData> children;
    private String classe;
    private Boolean divider;
    private String variant;

    public void setUrl(String url) {
        this.url = url.startsWith("/") ? url : "/" + url;
    }

}
