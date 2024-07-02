package com.rinalyn.Bur_Gheran.NotFoundException;

public class OrderItemNotFoundException extends RuntimeException {
    public OrderItemNotFoundException(Long id){
        super("Could not Found order with " + id);

    }

}

