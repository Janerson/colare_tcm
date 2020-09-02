package com.dom.colare.domain.dto.api;

import com.dom.colare.domain.dto.BaseDTO;
import lombok.Data;

@Data
public class INavBadgeDTO extends BaseDTO {
    private String classe;
    private String text;
    private String variant;
}
