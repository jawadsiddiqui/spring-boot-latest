package com.dtors.advice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onExceptionOccurs(RuntimeException runtimeException)
    {
        var pd = ProblemDetail.forStatusAndDetail(
                HttpStatusCode.valueOf(400),
                runtimeException.getMessage()

        );
        return pd;
    }
}
