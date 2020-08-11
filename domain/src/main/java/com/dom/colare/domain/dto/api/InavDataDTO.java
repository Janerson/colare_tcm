package com.dom.colare.domain.dto.api;

import com.dom.colare.core.entidades.api.inav.INavData;
import com.dom.colare.domain.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class InavDataDTO extends BaseDTO {
    private String name;
    private String url;
    private String layoutTitulo;
    private String layoutDescricao;
    private String href;
    private String icon;
    private INavBadgeDTO badge;
    private Boolean title;
    private List<INavData> children;
    @JsonProperty("class")
    private String classe;
    private Boolean divider;
    private String variant;
}
