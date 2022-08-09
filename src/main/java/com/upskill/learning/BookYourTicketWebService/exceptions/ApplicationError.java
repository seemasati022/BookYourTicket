package com.upskill.learning.BookYourTicketWebService.exceptions;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

public enum ApplicationError {

    DEFAULT_ERROR(INTERNAL_SERVER_ERROR, "500", "default_server_error_exception");
    private HttpStatus httpStatus;
    private String code;
    private String message;

    ApplicationError(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
