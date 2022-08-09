package com.upskill.learning.BookYourTicketWebService.exceptions;

public class ApplicationException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private final ApplicationError error;

    public ApplicationException(ApplicationError error) {
        this.error = error;
    }
}
