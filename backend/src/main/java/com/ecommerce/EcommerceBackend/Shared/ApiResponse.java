package com.ecommerce.EcommerceBackend.Shared;

import lombok.Getter;
import lombok.Setter;

public class ApiResponse<T> {
    @Getter
    @Setter
    private int status;
    private String message;
    private Object result;

    public ApiResponse(int status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }
}
