package com.rinalyn.Bur_Gheran.NotFoundException;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id){
        super("Could not Found order with " + id);

    }

}
