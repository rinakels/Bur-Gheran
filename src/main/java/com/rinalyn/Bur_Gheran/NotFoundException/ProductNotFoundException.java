package com.rinalyn.Bur_Gheran.NotFoundException;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id){
        super("Could not Found product with " + id);

    }

}
