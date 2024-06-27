package com.rinalyn.Bur_Gheran.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rinalyn.Bur_Gheran.NotFoundException.UsersNotFoundException;


@RestControllerAdvice
public class UsersExceptionHandler {

    @ExceptionHandler(UsersNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String usersNotFoundHandler(UsersNotFoundException e){
        return e.getMessage();
    }


}
