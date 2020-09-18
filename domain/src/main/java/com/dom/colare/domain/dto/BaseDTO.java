package com.dom.colare.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

/**
 * Base DTO
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseDTO {
    private UUID uuid;
}

