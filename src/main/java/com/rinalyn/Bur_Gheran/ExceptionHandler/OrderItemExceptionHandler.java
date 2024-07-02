package com.rinalyn.Bur_Gheran.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rinalyn.Bur_Gheran.NotFoundException.OrderItemNotFoundException;


@RestControllerAdvice
public class OrderItemExceptionHandler {

    @ExceptionHandler(OrderItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String OrderItemNotFoundHandler(OrderItemNotFoundException e){
        return e.getMessage();
    }


}


