package com.upskill.learning.BookYourTicketWebService.exceptions.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    //private static final Logger = Logger.

    @Autowired
    private MessageSource messageSource;

//    @ExceptionHandler(value = {Exception.class})
//    public ResponseEntity<Object> handleException(Exception e){
//       // return ResponseEntity.status(DEFAULT_ERROR.)
//    }
}
/*
   @ExceptionHandler(EntityNotFoundException.class)
   protected ResponseEntity<Object> handleEntityNotFound(
           EntityNotFoundException ex) {
       ApiError apiError = new ApiError(NOT_FOUND);
       apiError.setMessage(ex.getMessage());
       return buildResponseEntity(apiError);
   }
}
 */
