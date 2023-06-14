package com.example.catalogservice.exception;

public class ApiException extends RuntimeException {


    public ApiException(String message) {
        super(message);
    }
}
