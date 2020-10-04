package com.szymanski.core.error;

import java.util.List;

public class ErrorResponse {

    private List<String>errors;

    public List<String> getErrors() {
        return errors;
    }

    public ErrorResponse(List<String> errors) {
        this.errors = errors;
    }
}
