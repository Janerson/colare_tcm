package com.dom.colare.api.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

@Data
public class ApiError {
    private HttpStatus status;
    private int statusCode;
    private String message;
    private List<String> errors;

    public ApiError(HttpStatus status, int statusCode, String message, List<String> errors) {
        super();
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.errors = errors;
    }

    public ApiError(HttpStatus status, int statusCode, String message, String error) {
        super();
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        errors = Collections.singletonList(error);
    }
}
