package com.dom.colare.domain.dto.api;

import com.dom.colare.domain.dto.BaseDTO;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class MenuDTO extends BaseDTO {
    private boolean title;
    private String name;
    private String url;
    private String ico;
    private BadgeDTO badge;
    private List<MenuDTO> links;
    private String variant;
    private Boolean divider;

    @JsonAlias("class")
    private String classe;
}
